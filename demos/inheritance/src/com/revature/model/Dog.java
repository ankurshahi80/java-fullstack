package com.revature.model;

// Dog is like an extension of Animal
//We are adding additional properties and behaviours on top pf what Animal alrady has
public class Dog extends Animal {

    private String name;

    public Dog(int numOfLegs, String name){
        super(numOfLegs); //Calling Animal class' constructor
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
