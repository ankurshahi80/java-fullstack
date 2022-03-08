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

    @Override // The purpose of the @Override annotation is to provide metadata to the compiler
    // and to the IDE is to inform us whether we are actually overriding a method or not
    // commonly, developers might make typos when they're trying to override something, and end up
    // not actually doing so.
    public void makeNoise(){
        System.out.println("Woof!");
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
