package com.jml1024.eureka.listener;

import com.jml1024.eureka.event.InitializePost;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<InitializePost> {
    @Override
    public void onApplicationEvent(InitializePost event) {
        System.out.printf("--------------------:" + event.getStatus());
    }
}
