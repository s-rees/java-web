package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {

    private final FirstService firstserve;

    public FirstController(FirstService firstserve) {
        this.firstserve = firstserve;
    }

    @GetMapping("/")
    public ResponseEntity<String> GetRequest(){
        return new ResponseEntity("Hello World", HttpStatus.OK );
    }

    @GetMapping("/home")
    public List<ExampleEntity> GetPeople(){
        return firstserve.getAll();
    }

    @PostMapping("/json")
    public String processJson(@RequestBody FirstModel requestdata){
        String name = requestdata.GetName();
        long age = requestdata.GetAge();
        return "Name: " + name + " and age is " + age;
    }

    @PostMapping("/add")
    public ExampleEntity AddData(@RequestBody FirstModel addingdata) {
        return firstserve.saveData(addingdata.GetId(), addingdata.GetName(), addingdata.GetAge());
    }

}
