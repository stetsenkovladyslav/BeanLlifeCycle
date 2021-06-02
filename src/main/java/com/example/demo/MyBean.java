package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean {
    public MyBean myBean;

    @Autowired
    public MyBean(MyBean myBean) {
        this.myBean = myBean;
    }
    public MyBean() {
        System.out.println("MyBean instance created");
    }

    @PostConstruct
    private void init() {
        System.out.println("Verifying Resources");
    }

    @PreDestroy
    private void shutdown() {
        System.out.println("Shutdown All Resources");
    }

    public void close() {
        System.out.println("Closing All Resources");
    }
}