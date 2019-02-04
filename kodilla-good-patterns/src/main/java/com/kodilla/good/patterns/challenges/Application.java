package com.kodilla.good.patterns.challenges;

public class Application{

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieveOrder();
        ProductOrderService productOrderService = new ProductOrderService(new OrderProcessor(),new DeliveryService());
        productOrderService.process(order);
    }
}
