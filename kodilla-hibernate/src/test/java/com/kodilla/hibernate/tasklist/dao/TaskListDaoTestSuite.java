package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    @Transactional
    void testFindByListName() {
        // Given
        TaskList taskList1 = new TaskList("ToDo List", "List for tasks to do");
        TaskList taskList2 = new TaskList("In Progress List", "List for tasks in progress");
        TaskList taskList3 = new TaskList("Done List", "List for completed tasks");

        taskListDao.save(taskList1);
        taskListDao.save(taskList2);
        taskListDao.save(taskList3);

        // When
        List<TaskList> foundLists = taskListDao.findByListName("ToDo List");

        // Then
        assertEquals(1, foundLists.size());
    }
}