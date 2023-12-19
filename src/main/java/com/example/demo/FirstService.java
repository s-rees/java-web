package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstService {

    private final FirstRepository firstrepository;

    public FirstService(FirstRepository firstrepository) {

        this.firstrepository = firstrepository;
    }

    public List<ExampleEntity> getAll() {
        return firstrepository.findAll();
    }

    public ExampleEntity saveData(Long Id, String name, Long Age){
        ExampleEntity data = new ExampleEntity();

        data.setId(Id);
        data.setAge(Age);
        data.setName(name);

        return firstrepository.save(data);
    }

}
