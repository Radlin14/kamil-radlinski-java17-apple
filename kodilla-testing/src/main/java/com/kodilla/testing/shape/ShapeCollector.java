package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();



    public void addFigure(Shape shape){
        shapeList.add(shape);


    }
    public void removeFigure(Shape shape){
        shapeList.remove(shape);

    }
    public Shape getFigure(int n){
    return shapeList.get(n);
    }
    public void showFigures() {
        Shape shape ;
        for(int i =0 ; i<shapeList.size() ; i++) {
           shape = shapeList.get(i);
            System.out.println(" This is " + shape.getShapeName() + " and its surface area is - " + shape.getField() + " cm3");
        }
    }



    }


