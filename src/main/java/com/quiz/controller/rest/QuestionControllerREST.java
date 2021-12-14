package com.quiz.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionControllerREST {

    @GetMapping("/hello")
    public String hello(){
        return "{hello: world}";
    }
}
