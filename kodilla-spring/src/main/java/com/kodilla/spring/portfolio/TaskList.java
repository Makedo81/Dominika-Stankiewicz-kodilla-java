package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class TaskList {

    private List<String> tasks;

    public TaskList() {

        this.tasks = new ArrayList<>();
    }

    public List<String> addTask(String task) {
        tasks.add(task);
        return new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }
}