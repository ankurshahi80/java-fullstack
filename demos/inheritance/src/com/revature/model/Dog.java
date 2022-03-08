package com.revature.model;

// Dog is like an extension of Animal
// We are adding additional properties and behaviours on top of what Animal already has
public class Dog extends Animal {

    private String name;

    public Dog(int numOfLegs, String name){
        super(numOfLegs); //Calling Animal class' constructor
        this.name = name;
    }

    public void playFetch(){
        System.out.println(this.name + " is playing fetch!");
    }

    /*
        Getters and Setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
