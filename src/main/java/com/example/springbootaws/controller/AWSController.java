package com.example.springbootaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AWS")
public class AWSController {
    @GetMapping("/message")
    public String getMessage(){
        return "Welcome to AWS world!!!";
    }

}
