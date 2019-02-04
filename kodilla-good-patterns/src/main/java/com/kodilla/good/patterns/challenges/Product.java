package com.kodilla.good.patterns.challenges;

public class Product {

    private String item;
    private int productCode;

    public Product(String item, int productCode) {
        this.item = item;
        this.productCode = productCode;
    }

    public String getItem() {
        return item;
    }

    public int getProductCode() {
        return productCode;
    }


    @Override
    public String toString() {
        return "Product{" +
                "item='" + item + '\'' +
                ", productCode=" + productCode +
                '}';
    }
}
