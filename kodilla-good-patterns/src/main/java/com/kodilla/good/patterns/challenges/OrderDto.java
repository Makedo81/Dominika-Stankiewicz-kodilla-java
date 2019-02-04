package com.kodilla.good.patterns.challenges;

public class OrderDto {

 boolean orderValidated;
 User user;

    public OrderDto( User user, boolean orderValidated) {
        this.user = user;
        this.orderValidated = orderValidated;
    }

    public boolean isOrderValidated() {
        return orderValidated;
    }

    public String getUser() {
        return user.getAddress();
    }
}
