package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

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

