package com.kodilla.testing.shape;

 class Square implements Shape {
     private double a;

     public Square(double a) {
         this.a = a;
     }

     public String getShapeName(){
         return "Square";
     }

     public double getField(){
         return a * a;
     }

 }
