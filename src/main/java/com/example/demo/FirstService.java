package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstService {

    private final FirstRepository firstrepository;

    public FirstService(FirstRepository firstrepository) {

        this.firstrepository = firstrepository;
    }

    public List<ExampleEntity> getAll(){
        return firstrepository.findAll();
    }


}
