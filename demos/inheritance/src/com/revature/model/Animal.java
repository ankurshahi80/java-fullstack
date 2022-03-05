package com.revature.model;

public class Animal {

    protected  int numOfLegs;

    public Animal(int numOfLegs){
        super(); //Calling the object class
        this.numOfLegs=numOfLegs;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }
}
