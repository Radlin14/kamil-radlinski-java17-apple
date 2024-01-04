package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    public static final String LISTNAME= "sds";
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

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);
    }
}