package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {
    private ApplicationContext applicationContext;

    @Autowired
    public BeanController(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
    @GetMapping("/")
    public ResponseEntity<String> getBean() {
        MyBean mb1 = applicationContext.getBean(MyBean.class);
        System.out.println(mb1.hashCode());
        return ResponseEntity.status(HttpStatus.OK)
                .body("Hello World");
    }
}