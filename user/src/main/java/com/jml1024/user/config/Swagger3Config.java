package com.jml1024.user.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class Swagger3Config {

    @Bean
    public OpenAPI swaggerConfig () {
        Contact contact = new Contact();
        contact.name("Evil")
                .email("jml1024@hotmail.com")
                .url("www.jml1024.com")
                .extensions(new HashMap<>());
        // 授权许可信息(license)，用于描述API的授权许可信息，包括名称、URL等；假设当前的授权信息为Apache 2.0的开源标准
        License license = new License()
                // 授权名称
                .name("Apache 2.0")
                // 授权信息
                .url("https://www.apache.org/licenses/LICENSE-2.0.html")
                // 标识授权许可
                .identifier("Apache-2.0")
                // 使用Map配置信息（如key为"name","url","identifier"）
                .extensions(new HashMap<>());
        //创建Api帮助文档的描述信息、联系人信息(contact)、授权许可信息(license)
        Info info = new Info()
                // Api接口文档标题（必填）
                .title("Spring Cloud Template文档")
                // Api接口文档描述
                .description("Spring Cloud Template文档")
                // Api接口版本
                .version("1.2.1")
                // Api接口的服务条款地址
                .termsOfService("http://127.0.0.1:8080/")
                // 设置联系人信息
                .license(license)
                // 授权许可信息
                .contact(contact);

        OpenAPI openAPI = new OpenAPI();
        openAPI.info(info);
        return openAPI;
    }
}
