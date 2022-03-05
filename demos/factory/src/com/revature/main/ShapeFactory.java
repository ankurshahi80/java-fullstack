package com.revature.main;

import java.util.Scanner;

public class ShapeFactory {

    private Scanner sc;

    public ShapeFactory9) {
    sc  = new Scanner(System.in)
    }

    public Shape createShape(String type) {
    switch(type){
        case "triangle":
            System.out.println("Enter a base for the triangle: ");
            double base = Double.parseDouble(sc.nextLine());
            System.out.println("Enter a height for the triangle: ");
            double height = Double.parseDouble(sc.nextLine());

            return new Triangle(base, height);

        case "circle":
            System.out.println("Enter");
        }
    }
}
