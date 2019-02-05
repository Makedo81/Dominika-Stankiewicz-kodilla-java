package com.kodilla.good.patterns.challenges;

public class DeliveryService {

    public boolean sendOrder(Order order) {

        System.out.println("Order is sent to : " + order.getUser().getAddress());
        return true;
    }
}

