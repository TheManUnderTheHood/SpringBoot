package com.example.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class web {
    @GetMapping("/")
    public String Home(){
        return "index";
    }
    @GetMapping("/1")
    public String content() {
        return "1";
    }

    @GetMapping("/2")
    public String project() {
        return "2";
    }

}
