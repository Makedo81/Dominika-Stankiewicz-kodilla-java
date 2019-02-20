package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    public TaskListDao taskListDao;
    private static final String LIST = "In progress";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LIST,"Tasks with open deadlines");
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> taskListResult = taskListDao.findByName(listName);
        //Then
        Assert.assertEquals(1,taskListResult.size());
        //CleanUp
        int id = taskListResult.get(0).getId();
        taskListDao.delete(id);
    }
}
