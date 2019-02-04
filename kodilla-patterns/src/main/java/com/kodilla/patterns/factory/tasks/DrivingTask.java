package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        System.out.println("Driving task is executing.Driving to "+where);
        return "Driving task is executing.Driving to "+where;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean getTaskExecuted() {
        System.out.println("Arrived to " + where);
        return true;
    }

    public String getWhere() {

        return where;
    }

    public String getUsing() {
        return using;
    }
}
