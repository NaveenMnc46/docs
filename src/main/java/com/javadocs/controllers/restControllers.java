package com.javadocs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class restControllers {

    @GetMapping("/")
    public String baseHead() {
        return "Hello, Good Morning ";
    }

}
