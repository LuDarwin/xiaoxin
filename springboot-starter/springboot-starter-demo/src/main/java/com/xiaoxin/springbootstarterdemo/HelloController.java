package com.xiaoxin.springbootstarterdemo;


import com.xiaoxin.starter.HelloFormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloFormatTemplate helloFormatTemplate;

    @GetMapping("/hello")
    public String format() {
        return helloFormatTemplate.doFormat();
    }
}
