package com.revature.main;

public class Driver {

    // Control flow

    // PATH CONDITIONS
    // 1. If statements
    // If-else statements
    // Nested if statements / if-else statements
    // 2. Switch
    //      - case
    //      - default

    // LOOPS
    // 3. While / do-while loops
    // 4. For loops
    // 5. For-each loop
    // break
    // continue

    // return

    public static void main(String[] args) {
        // if statement: execute code if the expression is true
        // if (<boolean expression>) {}
        if( 10 == 10) {
            System.out.println("10 is equal to 10");
        }

        // if-else statements: executes else block if expression is false
        if (10 == 11){
            System.out.println("10 is equal to 11");
        } else {
            System.out.println("10 is not equal to 11");
        }

        /*
            Nested if statements
         */
        String  gender = "female";
        int age = 20;

        if(gender.equals("female")){
            if(age>=18){
                System.out.println("The person is a woman");
            } else {
                System.out.println("The person is a girl.");
            }
        } else if (gender.equals("male")){

            if (age>=18){
                System.out.println("The the person is a man ");
            } else {
                System.out.println("The person is a boy.");
            }

        }

        /*
            Switch

            switch(<variable>) { ... }
         */

        int month = 2;
        switch(month){ // byte, short, char, int, String, Enum
            case 1:
                System.out.println("It is January");
                break;
            case 2:
                System.out.println("It is February");
                break;
            case 3:
                System.out.println("It is March");
                break;
            case 4:
                System.out.println("It is April");
                break;
            default:
                System.out.println("It is not January, February, March, or April");
        }

        /*
            Loops
         */

        // while loop
        // while (<conditions>){}
        int i = 10;
        while (i>=0){
            System.out.println("i: " + i);
            i--;
        }

        // do-while loop
        do {
            System.out.println("i: " + i);
        } while (i>100);

        // for loop
        // for (<initialization block>; <condition block>;<increment/decrement block>) {}

        for (int j = 0; j <=10; j++){
            System.out.println("j: " + j);
        }

        int[] myIntArray = {5, 2, 3, 10, 15};

        for (int j = 0; j<myIntArray.length; j++){
            System.out.println(myIntArray[j]);
        }
        // for-each loop
        // used to iterate over an array much more quickly

        for (int element: myIntArray){
            System.out.println(element);
        }

        // Continue
        for(int j=0; j<10; j++){
            if(j%2 == 1){ // is j odd?
                continue; // skip the remaining code and go to the next iteration
            }
            System.out.println("j: " + j);
        }

        printString("abc");
        printString(null);
    }

    public static void  printString(String s){
        if (s==null){
            return; // You CAN have a return statement for a void method
        }

        System.out.println(s);
    }
}
