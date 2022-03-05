package com.revature.model;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    // Implementing the abstract method for Shape
    public double calculateArea() {
        return 0.5 * this.base*this.height;
    }
}
