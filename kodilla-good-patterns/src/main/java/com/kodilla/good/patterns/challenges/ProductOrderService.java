package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    public OrderProcessor orderProcessor;
    public DeliveryService deliveryService;

    public ProductOrderService(OrderProcessor orderProcessor,DeliveryService deliveryService) {

        this.orderProcessor = orderProcessor;
        this.deliveryService = deliveryService;
    }

        public OrderDto process (Order order){

            boolean orderValidated = orderProcessor.validate(order);
            if (orderValidated) {
                System.out.println("Order is processed");
                deliveryService.sendOrder(order);
                return new OrderDto(order.getUser(), true);
            } else {
                return new OrderDto(order.getUser(), false);
            }
        }
    }


