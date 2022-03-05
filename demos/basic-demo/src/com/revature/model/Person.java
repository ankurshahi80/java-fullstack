package com.revature.model;

// The Person class defines 3 properties an 1 behaviour that objects constructed from this blueprint should have
public class Person {

    public String firstName;
    public String lastname;
    public int age;

    // Constructor #1
    public Person(){
        super();
    }

    // Constructor #2
    public Person(String firstName, String lastname, int age){
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
    }

    public void speak(){
        System.out.println("Hi, my name is " + firstName + ".");
    }
}
