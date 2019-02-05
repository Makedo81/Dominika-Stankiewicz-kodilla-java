package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    boolean validate(Order order) {
        if (order.getBasket() != null) {
            System.out.println("\n" + "Validating order: " + order.getBasket());
            System.out.println("Order is validated");
            return true;
        }
        return false;
    }
}