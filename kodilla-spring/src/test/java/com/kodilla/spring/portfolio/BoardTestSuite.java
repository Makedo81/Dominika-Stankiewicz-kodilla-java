package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        TaskList doneList = board.getDoneList();
        doneList.addTask("Task for doneList");
        String result = doneList.getTask(1);
        //Then
        Assert.assertEquals("Task for doneList",result);
    }
}
