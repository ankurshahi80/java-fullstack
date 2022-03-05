package com.revature.main;

import com.revature.model.Person;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        methodA();

        methodB("absdefg");

        // We are constructing a Person object
        Person p1= new Person();

        // Populate the object properties with  values
        p1.firstName="John";
        p1.lastname="Doe";
        p1.age=18;

        // Invoking a behaviour of that particular object
        p1.speak();

        // Jane Doe
        Person myPerson = new Person("Jane","Doe", 25);
        myPerson.speak();

        System.out.println("End of main() method");
    }

    public static void methodA(){
        System.out.println("Running methodA()!!!");
    }

    // Methods are blocks or code that can be executed by other blocks of code
    // Methods typically take an input and give an output
    // The type of output here is "void", which means there is no output from the method
    // The type of input is a String (sequence of characters)
    public static void methodB(String myString){
        System.out.println("myString: "+ myString);
    }
}
