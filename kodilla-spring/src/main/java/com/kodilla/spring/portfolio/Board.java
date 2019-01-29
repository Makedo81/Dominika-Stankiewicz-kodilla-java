package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList;
    TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }
}
