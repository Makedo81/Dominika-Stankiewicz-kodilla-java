package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        System.out.println("Shopping Task is executing");
        return "Shopping Task is executing";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean getTaskExecuted() {
        System.out.println("Order for :" + whatToBuy + ", quantity:" + quantity + " is proceed");
        return true;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }
}
