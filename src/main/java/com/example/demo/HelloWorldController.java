package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/script")
    public String script(){
        return "script";
    }
}
