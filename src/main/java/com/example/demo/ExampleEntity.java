package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long Age;

    public ExampleEntity(Long id, String name, Long age) {
        this.id = id;
        this.name = name;
        this.Age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return Age;
    }

    public void setAge(Long age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "ExampleEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }
}

