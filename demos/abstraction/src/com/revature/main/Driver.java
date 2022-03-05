package com.revature.main;

import com.revature.model.Circle;
import com.revature.model.Shape;
import com.revature.model.Triangle;

public class Driver {

    public static void main(String[] args) {
        Shape s =new Triangle(10,5);
        System.out.println(s.getName());
        System.out.println("area " + s.calculateArea());

        s=new Circle(5.5);
        System.out.println(s.getName());
        System.out.println("area " + s.calculateArea());

    }
}
