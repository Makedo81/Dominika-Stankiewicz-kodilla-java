package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList,TaskList inProgressList, TaskList doneList) {
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

    public void showTasks() {
        System.out.println("To to tasks: " + toDoList.getTasks());
        System.out.println("In progress tasks: " + inProgressList.getTasks());
        System.out.println("Done tasks: " + doneList.getTasks());
    }
}
