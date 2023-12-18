package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @GetMapping("/")
    public String GetRequest(@RequestParam String apiKey){
        return "Your apiKey is " + apiKey;
    }

    @PostMapping("/json")
    public String processJson(@RequestBody FirstModel requestdata){
        String name = requestdata.GetName();
        int age = requestdata.GetAge();
        return "Name: " + name + " and age is " + age;
    }

}
