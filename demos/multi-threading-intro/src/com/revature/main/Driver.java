package com.revature.main;

public class Driver {

    public static void main(String[] args) {
        // In the old days, multi-threading would be accomplished through these two means
        // 1. extend the thread class and override the run() method
        //      - run() method represents the code that you want for a new thread being created
        //      to execute

        // Method #1
        Thread t1 = new MyTask();
        t1.start(); // Start up a new thread from the main thread

        // Method #2
        Runnable r = new MyRunnable();
        Thread t2 = new Thread(r);
        t2.start();

        // Notice, Runnable is a functional interface, so we can do a lambda
        Thread t3 = new Thread(() ->
        System.out.println("Thread name: " + Thread.currentThread().getName());


    }
}
