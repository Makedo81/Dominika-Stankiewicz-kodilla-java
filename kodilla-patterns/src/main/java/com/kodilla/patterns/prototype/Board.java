package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public class Board {

     private String name;
     private Set<TasksList>lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getLists() {
        return lists;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String s =  "      Board[" + name + "]";
        for (TasksList list: lists) {
            s = s+"\n"+list.toString();
        }
        return s;
    }

    public Board shallowCopy() throws  CloneNotSupportedException {
        return (Board)super.clone();
    }
}
