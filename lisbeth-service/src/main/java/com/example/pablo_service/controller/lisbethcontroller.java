package com.example.pablo_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class lisbethcontroller {

    @GetMapping("/name")
    public String getName() {
        return "Lisbeth";
    }
}