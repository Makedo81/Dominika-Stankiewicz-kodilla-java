package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    TaskList  doneList;

    @Autowired
    TaskList  toDoList;

    @Autowired
    TaskList  inProgressList;

    @Autowired
    TaskList  taskList;

    @Autowired
    public Board board(TaskList doneList,TaskList toDoList){
        return new Board(doneList,toDoList);
    }

    @Bean(name="doneList")
    public TaskList getDoneList(){
        return new TaskList();
    }

    @Bean(name="toDoList")
    public TaskList getToDoList(){
        return new TaskList();
    }

    @Bean(name="inProgressList")
    public TaskList getInProgressList(){
        return new TaskList();
    }
}

