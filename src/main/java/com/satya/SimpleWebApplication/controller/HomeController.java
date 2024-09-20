package com.satya.SimpleWebApplication.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello! ths is satya";
    }
}
