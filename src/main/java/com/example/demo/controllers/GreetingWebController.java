package com.example.demo.controllers;

import com.example.demo.services.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingWebController {
    @Autowired
    private GreetingAppService myService;

    @GetMapping("/")
    public String welcome(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        String greeting = myService.greet(name);
        model.addAttribute("greeting", greeting);
        return "index";
    }
}
