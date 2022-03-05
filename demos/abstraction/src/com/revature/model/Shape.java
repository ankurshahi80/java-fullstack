package com.revature.model;

public abstract class Shape {

    protected String name;

    //We have defined a constructor
    public Shape(String name){
        this.name = name;
    }
    // Abstract method
    public abstract double calculateArea();

    public String getName() {
        return  name;
    }
}
