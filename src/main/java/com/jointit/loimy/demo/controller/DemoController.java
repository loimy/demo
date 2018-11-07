package com.jointit.loimy.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class DemoController {
    @GetMapping("/hello")
    public String HelloWorld(){
        return "hello world!";

    }
}
