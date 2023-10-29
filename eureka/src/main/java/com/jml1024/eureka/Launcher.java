package com.jml1024.eureka;

import com.jml1024.eureka.event.InitializePost;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
//        SpringApplication.run(Launcher.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.jml1024.eureka");
        context.publishEvent(new InitializePost(context, "Y"));

    }
}
