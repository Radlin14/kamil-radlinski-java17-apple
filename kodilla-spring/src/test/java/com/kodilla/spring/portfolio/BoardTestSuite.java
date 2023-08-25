package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        // When
        board.getToDoList().getTasks().add("Code formatting");
        board.getInProgressList().getTasks().add("Quotation of a project");
        board.getDoneList().getTasks().add("Application testing");

        // Then
        assertEquals("Code formatting", board.getToDoList().getTasks().get(0));
        assertEquals("Quotation of a project", board.getInProgressList().getTasks().get(0));
        assertEquals("Application testing", board.getDoneList().getTasks().get(0));
    }
}