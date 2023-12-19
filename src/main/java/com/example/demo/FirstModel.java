package com.example.demo;

public class FirstModel {
    public int Id;
    public String name;
    public int Age;

    public FirstModel(int Id, String name, int Age){
        this.Id = Id;
        this.name = name;
        this.Age = Age;
    }

    public long GetId(){
        return Id;
    }
    public String GetName(){
        return name;
    }
    public long GetAge(){
        return Age;
    }

    @Override
    public String toString(){
        return "This is the first model";
    }
}
