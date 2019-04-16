package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MentorsTestSuite {

    @Test
    public void update() {

        Homework dominika = new DominikaHomework();
        Homework adam = new AdamHomework();
        Homework alex = new AlexHomework();

        Mentor michal = new Mentor("Michal O.");
        Mentor andy = new Mentor("Andy A.");

        dominika.registerObserver(michal);
        adam.registerObserver(andy);
        alex.registerObserver(michal);

        dominika.addTask("Task 24.4");
        dominika.addTask("Task 24.5");
        adam.addTask("Task 24.1");
        adam.addTask("Task 24.2");
        adam.addTask("Task 24.3");
        alex.addTask("Task 24.3");
        alex.addTask("Task 24.5");

        assertEquals(4,michal.getUpdateCount());
        assertEquals(3,andy.getUpdateCount());
    }
}