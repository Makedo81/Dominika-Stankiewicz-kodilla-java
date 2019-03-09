package com.kodilla.kodillahibernate.invoice;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ITEMS")
public class Item {

    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item() {
    }

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name= "ID")
    public int getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "INVOICE_iD")
    public Invoice getInvoice() {
        return invoice;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }


    @Column(name= "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name= "QUANTITY")
    public int getQuantity() {
        return quantity;
    }
    @Column(name= "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
