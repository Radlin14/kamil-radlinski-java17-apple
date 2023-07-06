package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

        @DisplayName("Testing adding a figure to list")
        @Test
         void testingAddFigures() {
            //Given
            Shape circle = new Circle(2);
            ShapeCollector shapeCollector = new ShapeCollector();
            //Then
            shapeCollector.addFigure(circle);
            //When
            Assertions.assertNotNull(shapeCollector.getFigure(0));
        }
        @DisplayName("Testing remove figure from list")
        @Test
         void testingRemoveFigures() {
            //Given
            Shape circle = new Circle(2);
            Shape square = new Square(3);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            //When
            shapeCollector.removeFigure(circle);
            //Then
            Assertions.assertSame(square, shapeCollector.getFigure(0));
        }
    @DisplayName("Testing figure getting from list")

    @Test
    void testingGetFigures() {
        //Given
        Shape square = new Square(3);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When & Then
        Assertions.assertSame(square, shapeCollector.getFigure(0));
    }
    @DisplayName("Testing showing list object")
    @Test
    void testingShowFigures() {
        //Given
        Shape square = new Square(3);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(square);
        //Then
        Assertions.assertEquals("This is Square the surface area equally 9.0 cm3", shapeCollector.showFigures());

    }
}
