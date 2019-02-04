package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    boolean validate(Order order) {
        if (order.getBasket() != null) {
            System.out.println("\n" + "Validating order");
            return true;
        }
        return false;
    }
}