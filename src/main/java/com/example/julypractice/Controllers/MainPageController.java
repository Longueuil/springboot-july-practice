package com.example.julypractice.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {

    // inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/team")
    public String getInfo(){
        return "Coach: " + coachName + " Team: " + teamName;
    }

    @GetMapping("/")
    public String helloApp(){
        return "Hello";
    }
}
