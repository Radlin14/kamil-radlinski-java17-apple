package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();

        // Then
        assertEquals("Buy groceries", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task paintingTask = factory.createTask(TaskFactory.PAINTING);
        paintingTask.executeTask();

        // Then
        assertEquals("Paint room", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task drivingTask = factory.createTask(TaskFactory.DRIVING);
        drivingTask.executeTask();

        // Then
        assertEquals("Drive to work", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryInvalidTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task invalidTask = factory.createTask("Invalid");

        // Then
        assertNull(invalidTask);
    }
}
