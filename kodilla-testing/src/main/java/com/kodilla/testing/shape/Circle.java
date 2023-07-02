package com.kodilla.testing.shape;

public class Circle implements Shape{

    double radius;
    private double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName(){
        return "Circle";
    }

    public double getField(){
        return pi * (radius*radius);
    }

}
