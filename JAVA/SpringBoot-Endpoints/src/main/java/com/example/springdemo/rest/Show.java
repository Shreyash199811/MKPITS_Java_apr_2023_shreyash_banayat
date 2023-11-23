package com.example.springdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Show {
    @Value("${stud.message}")
    private String message;
    @GetMapping("/")
    public String display(){
        return "Hello "+message+" World!";
    }

}
