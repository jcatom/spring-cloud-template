package com.jmll1024.user.controller;

import com.alibaba.fastjson2.JSON;
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

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class RestTestController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

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
}
