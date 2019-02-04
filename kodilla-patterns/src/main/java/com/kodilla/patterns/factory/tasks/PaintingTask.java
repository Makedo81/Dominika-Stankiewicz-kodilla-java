package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{

    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public String executeTask() {
        System.out.println("Painting task is executing." + whatToPaint +" is being paint");
        return "Painting task is executing." + whatToPaint +" is being paint";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean getTaskExecuted() {
        return true;
    }
}
