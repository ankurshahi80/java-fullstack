package com.revature.model;

public class Cat extends Animal{
    private String name;

    public Cat(int numOfLegs, String name){
        super(numOfLegs);
        this.name = name;
    }

}
