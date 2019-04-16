package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMarinara extends PizzaOrderDecorator {

    public PizzaMarinara(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10.00));
    }
    @Override
    public String getCurrency() {
        return super.getCurrency();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + aglio + origano";
    }
}
