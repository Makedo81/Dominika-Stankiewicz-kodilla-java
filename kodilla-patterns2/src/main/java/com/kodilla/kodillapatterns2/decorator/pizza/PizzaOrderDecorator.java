package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class PizzaOrderDecorator implements PizzaOrder {

    private final PizzaOrder pizzaOrder;

    protected PizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getCurrency(){return pizzaOrder.getCurrency();}

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription();
    }
}