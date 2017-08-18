package com.example.myproject.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.lang.System;
import java.util.Properties;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to Spring Boot Application Hello!";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    
    @RequestMapping("/logout")
    public String logout() {
        return "logout";
    }
    
    @RequestMapping("/register")
    public String register() {
        return "register";
    }
    
}