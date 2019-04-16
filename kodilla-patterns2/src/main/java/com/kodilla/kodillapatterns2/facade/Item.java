package com.kodilla.kodillapatterns2.facade;

public class Item {

    private final Long productId;
    private final double qty;

    public Item(Long productId, double quantity) {
        this.productId = productId;
        this.qty = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQuantity() {
        return qty;
    }
}
