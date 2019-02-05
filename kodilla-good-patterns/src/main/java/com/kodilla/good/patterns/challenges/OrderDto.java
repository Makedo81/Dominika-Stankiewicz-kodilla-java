package com.kodilla.good.patterns.challenges;

public class OrderDto {

 boolean orderValidated;
 User user;

    public OrderDto( User user,boolean orderValidated) {
        this.user = user;
        this.orderValidated = orderValidated;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "orderValidated=" + orderValidated +
                ", user=" + user +
                '}';
    }
}
