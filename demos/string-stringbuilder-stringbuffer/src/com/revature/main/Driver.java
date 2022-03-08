package com.revature.main;

import java.lang.reflect.Field;

public class Driver {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // stringDemo();
        stringBuilderDemo();
    }

    public static void stringBuilderDemo() {
        // Strings are immutable, which means that if we want to do operations such as concatenation,
        // a new String object needs to be created each time

        // There is a lot of overhead in doing so

        // Problem: Reversing a String
        // input: Hello
        // output: olleH

        //Naive way
        String input = "Hello";
        String s = "";
        // O(n^2) algorithm
        // -> = length of the sting we want to reverse
        // O(n^2) implies that with a length of 10, we need ~100 operations
        // with a length of 20, we need ~400 operations

        long startTime = System.currentTimeMillis();
        for (int i = input.length()-1; i>=0; i--){
            s= s + input.charAt(i); // every time you do this (string concatenation), a new string object is created.
            // 0 + 1 + 2 + 3 + 4 <- n^2
        }
        long endTime = System.currentTimeMillis();
        System.out.println("s: " + s);
        System.out.println("String concatenation took " + (endTime - startTime) + " ms");

        // StringBuilder is like a String in the sense that it is an array of characters (behind the scenes),
        // but it is a mutable object (string)
        // You can add, remove, and update characters in a StringBuilder object
        // It is essentially a "mutable" String
        // StringBuffer is the same as StringBuilder, except it is "synchronized" (thread-safe)
        //  Thread-safe essentially means that if you have multiple threads trying to mutate the object,
        //  only one thread can do so at a time. Checking to see if there is a thread already using the object
        //  adds additional overhead.
        StringBuilder sb = new StringBuilder();
        // O(n) time complexity
        startTime = System.currentTimeMillis();
        for (int i = input.length()-1; i>=0; i--){
            sb.append(input.charAt(i)); // O(1) operation
        }
        endTime = System.currentTimeMillis();
        String output = sb.toString();
        System.out.println(output);
        System.out.println("StringBuilder took " + (endTime - startTime) + " ms");
    }

    public static void stringDemo() throws NoSuchFieldException, IllegalAccessException {
        // When your Java program runs, the JVM will scan through and find all unique occurences
        // of String literals and create a String object that will be in the String pool

        // String literals are reference variables

        String myString = "Hello, World!";
        System.out.println(myString);

        System.out.println("Hi, there!");

        myString = null;

        String myString2 = new String("Hello, World!"); // Any object that is constructed
        // with the new keyword will be in the regular heap

        String myString3 = "Hello, World!"; // myString and myString3 are referring to the same
        // String object in the String pool

        String myString4 = "Hello worl";

        /*
            Java Reflection: changing the internal value of a String
         */
        String s = "Hello, World!";
        Field f = String.class.getDeclaredField("value");
        f.setAccessible(true);
        f.set(s,"abcdefg".toCharArray());

        System.out.println("Hello, World!"); // abcdefg
        System.out.println("Hello, World!"); // abcdefg
        System.out.println("Hello, World!"); // abcdefg
        System.out.println("Hello, World!"); // abcdefg

        /*
            String API methods
         */
        String s1 = "Hello";
        String s2 = ", World!";

        s1.concat(s2); // Concat will take the first String and concatenate it with the second string
        // Strings are immutable, calling .concat and doing nothing with it will not accomplish anything

        System.out.println(s1); // Hello

        s1 = s1.concat(s2); // concat creates a new String object (in the regular heap). Here we are
        // reassigning s1 to point to this new String object

        // If you see any method that looks like it is modifying a String, it is NOT, as
        // Strings are immutable. What it will do is return a reference to a new String object
        // that has been created.

        // .length()
        // to find the length of a string
        System.out.println("length of s1: "+ s1.length());

        // startsWith(...)
        System.out.println("s1 starts with He: " + s1.startsWith("He"));

        // endsWith(...)
        System.out.println("s1 ends with orld!: " + s1.endsWith("orld!"));

        // .matches(regular expression)
        System.out.println("abc123".matches("[a-z]+")); // Does abc123 only have 1 or more letters (a-z)? False

        // .indexOf(...)
        System.out.println("First occurrence of e is at index: " + "hello".indexOf("h"));

        // .charAt(...)
        for (int i =0 ;i < s.length(); i++){
            System.out.println(s.charAt(i));
        }

        // String comparison
        String x = "hello";
        String y = "hello";
        System.out.println("x.equals(y): " + (x.equals(y)));
        System.out.println("x == y: " + (x == y)); // true, because x and y are referring to the same object
        // in the String pool

        // String comparison
        String x1 = "hello"; //  String pool object
        String y1 = new String(new char[] {'h','e','l','l','o'}); // Heap object
        System.out.println("x1.equals(y1): " + (x1.equals(y1))); // true, because .equals compares the chars of each object
        System.out.println("x1 == y1: " + (x1 == y1));// false, because they are two different references

        // Whenever you utilize == between two reference variables, the question being asked is
        // "are these tow reference variables referring to the same object or not?"
    }

}

