package com.kodilla.kodillapatterns2.facade.api;

public class ItemDto {

    private final Long productId;
    private final double qty;

    public ItemDto(final Long productId,final double quantity) {
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


