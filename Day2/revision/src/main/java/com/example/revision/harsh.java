package com.example.revision;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class harsh {
    @GetMapping("/")
    public String hello(){
        return "This is revision of first class.";
    }

    @GetMapping("/home")
    public String home(){
        return "This is home.";
    }
}
