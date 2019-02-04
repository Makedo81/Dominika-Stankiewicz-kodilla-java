package com.kodilla.testing;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TaskManager {
    ArrayList<String> executedTask;

    public TaskManager() {
        this.executedTask = new ArrayList<String>();
    }
    public void executeTask(ArrayDeque<String>theQueue){
        while(theQueue.size()>0){
            String theTask = theQueue.poll();
            System.out.println("Game: "+theTask);
            executedTask.add(theTask);
        }
    }
}
