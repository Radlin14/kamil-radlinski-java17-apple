package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public Task createTask(String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Buy groceries", "Water", 2.0);
            case PAINTING:
                return new PaintingTask("Paint room", "White", "Bedroom");
            case DRIVING:
                return new DrivingTask("Drive to work", "Factory", "Subway");
            default:
                return null;
        }
    }
}
