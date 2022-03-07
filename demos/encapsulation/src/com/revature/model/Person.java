package com.revature.model;

public class Person {

    // Limit access to the fields
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /*
        Getters
     */
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    /*
        Setters
     */
    public void setFirstName(String firstName) {
        if (firstName.matches("[a-zA-Z]+")){
            this.firstName = firstName;
        } else {
            System.out.println("Invalid first name format");
        }

    }

    public void setLastName(String lastName) {
        if (lastName.matches("[a-zA-Z]+")){
            this.lastName = lastName;
        } else {
            System.out.println("Invalid last name format.");
        }

    }

    public void setAge(int age) {
        if(age>=0){
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be > 0");
        }
    }
}
