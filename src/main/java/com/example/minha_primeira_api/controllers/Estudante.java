package com.example.minha_primeira_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estudantes")
public class Estudante {
    @GetMapping
    public String hello() {
        return "Hello, World!";
    }
}
