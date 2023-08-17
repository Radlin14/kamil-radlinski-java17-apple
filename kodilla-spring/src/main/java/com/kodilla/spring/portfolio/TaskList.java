package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskList {
    List<String> tasks;

    @Autowired
    public TaskList(List<String> tasks) {
        tasks = new ArrayList<>();
    }
}
