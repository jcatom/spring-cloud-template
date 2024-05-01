package com.jml1024.core.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.jml1024.core.persistence")
public class MybatisConfig {
}
