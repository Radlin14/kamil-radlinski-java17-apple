package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.shape.*;
import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestingMain {
    public static void main(String[] args) {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Triangle(3,2));
        shapeCollector.addFigure(new Circle(2));
        shapeCollector.getFigure(0);
        shapeCollector.showFigures();

    }
}
