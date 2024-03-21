package com.api.example.exampleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/example")
public class ApiExampleController {

    @GetMapping
    public String exampleMethod(){
        return "Hello world!";
    }
}
