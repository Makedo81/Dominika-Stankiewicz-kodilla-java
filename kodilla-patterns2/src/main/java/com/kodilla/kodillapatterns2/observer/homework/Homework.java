package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Homework implements ObservableHomework {

    private final String userHomework;
    private final List<HomeworkObserver> mentors;
    ArrayDeque<String> tasks ;

    public Homework(String userHomework ) {
        this.userHomework = userHomework;
        this.mentors = new ArrayList<>();
        this.tasks = new ArrayDeque<>();
    }
    public void addTask(String task) {
        tasks.offer(task);
        notifyObserverHomework();
    }

    @Override
    public void registerObserver(HomeworkObserver homeworkObserver){
        mentors.add(homeworkObserver);
    }

    @Override
    public void notifyObserverHomework() {
        for (HomeworkObserver homeworkObserver : mentors) {
            homeworkObserver.update(this);
        }
    }

    public String getUserHomework() {
        return userHomework;
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }
}
