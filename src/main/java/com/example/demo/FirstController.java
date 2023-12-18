package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {

    private final FirstService firstserve;

    public FirstController(FirstService firstserve) {
        this.firstserve = firstserve;
    }

    @GetMapping("/")
    public String GetRequest(@RequestParam String apiKey){
        return "Your apiKey is " + apiKey + "thank you";
    }

    @GetMapping("/home")
    public List<ExampleEntity> GetRequest(){
        return firstserv.getAll();
    }

    @PostMapping("/json")
    public String processJson(@RequestBody FirstModel requestdata){
        String name = requestdata.GetName();
        int age = requestdata.GetAge();
        return "Name: " + name + " and age is " + age;
    }

}
