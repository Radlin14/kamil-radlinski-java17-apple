package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskTimeoutException;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    Board board;


    @Bean(name = "toDoList")
    public Board toDoList() {
        return new Board();
    }

    @Bean(name = "inProgressList")
    public Board inProgressList() {
        return new Board();
    }

    @Bean(name = "doneList")
    public Board doneList() {
        return new Board();
    }

}
