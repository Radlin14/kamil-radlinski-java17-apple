package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name = "Triangle";
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName(){
        return name ;
    }

    public double getField(){
        return (a * h)/2;
    }

}
