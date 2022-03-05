package com.revature.main;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        methodA();

        methodB("absdefg");

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
