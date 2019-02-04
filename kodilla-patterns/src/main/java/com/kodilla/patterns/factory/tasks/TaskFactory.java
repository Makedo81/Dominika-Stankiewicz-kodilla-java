package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task processTask(final String processedTask) {
        switch (processedTask) {
            case SHOPPING_TASK:
                return new ShoppingTask("Order", "Phone", 2);
            case PAINTING_TASK:
                return new PaintingTask("Painting", "Green", "Room");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "Warsaw", "MiniVan");

            default:
                return null;
        }
    }
}
