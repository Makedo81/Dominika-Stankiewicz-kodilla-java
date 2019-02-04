package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testExecutingShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.processTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals("Shopping Task is executing",shopping.executeTask());
        Assert.assertTrue(shopping.getTaskExecuted());
    }
    @Test
    public void testExecutingDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.processTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("Driving task is executing.Driving to Warsaw",driving.executeTask());
        Assert.assertTrue(driving.getTaskExecuted());
    }
    @Test
    public void testExecutingPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.processTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("Painting task is executing.Room is being paint",painting.executeTask());
        Assert.assertEquals("Painting",painting.getTaskName());
        Assert.assertTrue(painting.getTaskExecuted());
    }
}