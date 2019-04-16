package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements HomeworkObserver {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }
    @Override
    public void update(Homework homework) {
        System.out.println(name + " has new task to check from " +" "+ homework.getUserHomework()+" "+ homework.getTasks().poll());
        updateCount ++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
