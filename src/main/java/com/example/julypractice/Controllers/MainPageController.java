package com.example.julypractice.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {

    @GetMapping("/")
    public String helloApp(){
        return "Hello";
    }
}
