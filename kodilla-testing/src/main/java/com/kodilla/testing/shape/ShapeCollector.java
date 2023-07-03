package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapeList.add(shape);


    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);

    }

    public Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public String showFigures() {
        return shapeList.stream()
                .map(shape -> "This is " + shape.getShapeName() + " the surface area equally " + shape.getField() + " cm3")
                .collect(Collectors.joining("\n"));
    }

}





