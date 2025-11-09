package com.example.demo.controllers;

import com.example.demo.services.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {
    @Autowired
    private GreetingAppService mySimpleService;

    @GetMapping("/api/greet")
    public String greet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return mySimpleService.greet(name);
    }
}
