package com.revature.main;

public class Driver {

    publi

    public static void main(String[] args) {
        // Client
        //1. uses ShapeFactory
        //2. uses Shape interface

        ShapeFactory sf = new ShapeFactory();

        Shape s1 = sf.createShape("triangle");
        System.out.println(s1.getArea());

        Shape s2 = sf.createShape("circle");
        System.out.println(s2.getArea());

        Shape s3 = sf.createShape("square");
        System.out.println(s3.getArea());

        Shape s4 = sf.createShape("rectangle");
        System.out.println(s4.getArea());
    }
}
