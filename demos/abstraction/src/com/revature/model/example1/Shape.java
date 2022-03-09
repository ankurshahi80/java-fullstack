package com.revature.model.example1;

public abstract class Shape {

    protected String name;

    // We have defined a constructor in the abstract class
    // But we cannot instantiate an abstract class
    public Shape(String name){
        this.name = name;
    }
    // Abstract method
    public abstract double calculateArea();

    public String getName() {
        return  name;
    }
}
