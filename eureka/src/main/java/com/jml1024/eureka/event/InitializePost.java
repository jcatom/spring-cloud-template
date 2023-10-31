package com.jml1024.eureka.event;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class InitializePost extends ApplicationEvent {
    private String status = "Y";
    public InitializePost(Object source) {
        super(source);
    }

    public InitializePost(Object source, Clock clock) {
        super(source, clock);
    }

    public InitializePost(Object source, String status) {
        super(source);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
