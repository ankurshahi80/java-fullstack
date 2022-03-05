package com.revature.main;

public class Driver {
    public static void main(String[] args) {
        MyFunctionalInterface mfi1 = new A();
        mfi1.myMethod();

        MyFunctionalInterface mfi2 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Anonymous class example");
            }
        };

        mfi2.myMethod();

        // Lambda expressions
        // Think of lambda expression as being a "syntax shortcut" for an anonymous class
        // The one difference between an anonymous class and a lambda is that you can implement
        // multiple methods in an anonymous class, but the lambda expression is only a single
        // method
        // Lambda expressions only work with functional interfaces, since
        MyFunctionalInterface mfi3 = () ->{
            System.out.println("Lambda expression example");
        };

        mfi3.myMethod();
    }
}
