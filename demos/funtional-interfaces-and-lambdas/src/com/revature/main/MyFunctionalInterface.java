package com.revature.main;

// A functional Interface is just an interface with 1 abstract method
// The reason we have this limitation, is so that we can utilize "lambda expressions" to essentially
// implement that single abstract method
@FunctionalInterface
public interface MyFunctionalInterface {

    public abstract void myMethod();

}
