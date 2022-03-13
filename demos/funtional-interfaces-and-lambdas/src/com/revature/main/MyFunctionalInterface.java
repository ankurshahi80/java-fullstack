package com.revature.main;

// A functional Interface is just an interface with 1 abstract method
// The reason we have this limitation, is so that we can utilize "lambda expressions" to essentially
// implement that single abstract method
@FunctionalInterface // This annotation is not required, but it's similar to the @Override annotation
// where if we don't have a functional interface, the IDE + compiler would inform us
public interface MyFunctionalInterface {

    public abstract void myMethod();

}
