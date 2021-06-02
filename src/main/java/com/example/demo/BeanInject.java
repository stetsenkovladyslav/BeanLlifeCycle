package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanInject {
    private final MyBean myBean;

    @Autowired
    public BeanInject(MyBean myBean) {
        this.myBean = myBean;
    }



}
