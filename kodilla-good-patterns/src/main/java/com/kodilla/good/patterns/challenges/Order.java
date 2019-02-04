package com.kodilla.good.patterns.challenges;

public class Order {

    User user;
    Basket basket;

    public Order(User user, Basket basket) {
        this.user = user;
        this.basket = basket;
    }

    public Basket getBasket() {
        return basket;
    }

    public User getUser() {
        return user;
    }
}