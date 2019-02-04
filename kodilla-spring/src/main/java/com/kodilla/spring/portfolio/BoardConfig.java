package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier ("doneList")
    TaskList  doneList;

    @Autowired
    @Qualifier ("toDoList")
    TaskList toDoList;

    @Autowired
    @Qualifier ("inProgressList")
    TaskList inProgressList;

    @Bean
    public Board getBoard(){

        return new Board(toDoList,inProgressList,doneList);
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

