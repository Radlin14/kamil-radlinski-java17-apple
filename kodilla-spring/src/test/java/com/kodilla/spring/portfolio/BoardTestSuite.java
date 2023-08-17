package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board toDo = (Board) context.getBean("toDoList");
        Board progress = (Board) context.getBean("inProgressList");
        Board done = (Board) context.getBean("doneList");
        toDo.toDoList.tasks.add("Software update");
        progress.inProgressList.tasks.add("Removing bugs");
        done.doneList.tasks.add("Code formatting");
        //When & Then
        System.out.println(done.doneList);
        System.out.println(progress.inProgressList);
        System.out.println(toDo.toDoList);
    }
}
