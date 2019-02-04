package com.kodilla.good.patterns.challenges;

public class Basket {

    private Product product;
    int quantity;

    public Basket(Product product,int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
