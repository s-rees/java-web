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
        return "Your apiKey is " + apiKey + " thank you";
    }

    @GetMapping("/home")
    public List<ExampleEntity> GetRequest(){
        return firstserve.getAll();
    }

    @PostMapping("/json")
    public String processJson(@RequestBody FirstModel requestdata){
        String name = requestdata.GetName();
        long age = requestdata.GetAge();
        return "Name: " + name + " and age is " + age;
    }

    @PostMapping("/add")
    public ExampleEntity AddData(@RequestBody FirstModel addingdata){
        return firstserve.saveData(addingdata.GetId(), addingdata.GetName(), addingdata.GetAge());
    }

}
