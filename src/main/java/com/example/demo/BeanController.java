package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<String> getBean() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(MyConfig.class);
        annotationConfigApplicationContext.refresh();
        MyBean mb1 = annotationConfigApplicationContext.getBean(MyBean.class);
        System.out.println(mb1.hashCode());
        annotationConfigApplicationContext.close();
        return ResponseEntity.status(HttpStatus.OK)
                .body("Hello World");
    }

}
