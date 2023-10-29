package com.jmll1024.user.controller;

import com.alibaba.fastjson2.JSON;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class RestTestController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 字符集固定 utf-8
     */
    public static final String ENCODING = "utf-8";
    /**
     * 接入 appid
     */
    private String appid = "OP00000003";
    /**
     * 商户证书序列号，和商户私钥对应
     */
    private String mchSerialNo = "00dfba8194c41b84cf";
    private String merchantNo = "8221210594300JY";
    private String termNo = "A0073841";
    /**
     * API schema ,固定 LKLAPI-SHA256withRSA
     */
    public final static String SCHEMA = "LKLAPI-SHA256withRSA";
    private String SYMBOLS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    /**
     * 商户证书私钥，用于请求签名
     */
    private String merchantPrivateKeyPath = "C:\\Users\\Administrator\\Desktop\\api_private_key.pem";
    private SecureRandom RANDOM = new SecureRandom();
    private RestTemplate restTemplate;

    public RestTestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/test")
    public void restTest() {
        Map<String, String> map = new HashMap<>();
        map.put("orderNo", System.currentTimeMillis() + "");
        map.put("payStatus", "1");
        map.put("orderAmount", "100.00");
        map.put("userId", "12345678");
        map.put("payTime", "2022-12-29 17:33:00");
        String param = JSON.toJSONString(map);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType(MediaType.APPLICATION_JSON, StandardCharsets.UTF_8));
        HttpEntity<String> requestEntity = new HttpEntity<>(param, headers);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://localhost:8081/rest/test", requestEntity, String.class);
        String result = responseEntity.getBody();
        logger.info("通知支付结果返回内容：[{}]", result);
    }

    @GetMapping("/test/https")
    public void testHttps() throws IOException {
        Long outTransNo = System.currentTimeMillis();
        String auth = "{\"req_time\": \"20220923215100\",\"version\": \"3.0\",\"out_org_code\": \""+ appid +"\",\"req_data\": {\"account_type\":\"ALIPAY\",\"trans_type\":\"41\",\"merchant_no\": \""+ merchantNo + "\",\"term_no\": \"" + termNo + "\",\"out_trade_no\": \"" + outTransNo + "\",\"total_amount\": \"1\",\"location_info\": {\"request_ip\": \"10.176.1.192\"}}}";
        String body = "{\"version\": \"3.0\",\"req_time\": \"20220923215100\",\"out_org_code\": \""+ appid +"\",\"req_data\": {\"account_type\":\"ALIPAY\",\"trans_type\":\"41\",\"merchant_no\": \""+ merchantNo + "\",\"term_no\": \"" + termNo + "\",\"out_trade_no\": \"" + outTransNo + "\",\"total_amount\": \"1\",\"location_info\": {\"request_ip\": \"10.176.1.192\"}}}";
        String authorization = getAuthorization(auth);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", SCHEMA + " " + authorization);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("https://test.wsmsd.cn/sit/api/v3/labs/trans/preorder", requestEntity, String.class);
        String result = responseEntity.getBody();
        logger.info("请求结果：[{}]", result);
    }

    protected long generateTimestamp() {
        return System.currentTimeMillis() / 1000;
    }

    protected String generateNonceStr() {
        char[] nonceChars = new char[32];
        for (int index = 0; index < nonceChars.length; ++index) {
            nonceChars[index] = SYMBOLS.charAt(RANDOM.nextInt(SYMBOLS.length()));
        }
        return new String(nonceChars);
    }
    private String getAuthorization(String body) throws IOException {
        String nonceStr = generateNonceStr();
        long timestamp = generateTimestamp();

        String message = appid + "\n" + mchSerialNo + "\n" + timestamp + "\n" + nonceStr + "\n" + body + "\n";

        System.out.println("getToken message :  " + message);

        PrivateKey merchantPrivateKey = loadPrivateKey(new FileInputStream(new File(merchantPrivateKeyPath)));

        String signature = this.sign(message.getBytes(ENCODING), merchantPrivateKey);

        String authorization = "appid=\"" + appid + "\"," + "serial_no=\"" + mchSerialNo + "\"," + "timestamp=\""
                + timestamp + "\"," + "nonce_str=\"" + nonceStr + "\"," + "signature=\"" + signature + "\"";
        System.out.println("authorization message :" + authorization);

        return authorization;
    }

    public String sign(byte[] message, PrivateKey privateKey) {
        try {
            Signature sign = Signature.getInstance("SHA256withRSA");
            sign.initSign(privateKey);
            sign.update(message);
            return new String(Base64.encodeBase64(sign.sign()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("当前Java环境不支持SHA256withRSA", e);
        } catch (SignatureException e) {
            throw new RuntimeException("签名计算失败", e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException("无效的私钥", e);
        }
    }

    private static String getHeadValue(HttpResponse response, String key) {
        return (response.containsHeader(key)) ? response.getFirstHeader(key).getValue() : "";
    }

    private static boolean verify(X509Certificate certificate, byte[] message, String signature) {
        try {
            Signature sign = Signature.getInstance("SHA256withRSA");
            sign.initVerify(certificate);
            sign.update(message);
            byte[] signatureB = Base64.decodeBase64(signature);
            return sign.verify(signatureB);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("当前Java环境不支持SHA256withRSA", e);
        } catch (SignatureException e) {
            throw new RuntimeException("签名验证过程发生了错误", e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException("无效的证书", e);
        }
    }

    private PrivateKey loadPrivateKey(InputStream inputStream) {
        try {
            ByteArrayOutputStream array = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                array.write(buffer, 0, length);
            }

            String privateKey = array.toString("utf-8").replace("-----BEGIN PRIVATE KEY-----", "")
                    .replace("-----END PRIVATE KEY-----", "").replaceAll("\\s+", "");
            KeyFactory kf = KeyFactory.getInstance("RSA");
            return kf.generatePrivate(new PKCS8EncodedKeySpec(Base64.decodeBase64(privateKey)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("当前Java环境不支持RSA", e);
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException("无效的密钥格式");
        } catch (IOException e) {
            throw new RuntimeException("无效的密钥");
        }
    }
}
