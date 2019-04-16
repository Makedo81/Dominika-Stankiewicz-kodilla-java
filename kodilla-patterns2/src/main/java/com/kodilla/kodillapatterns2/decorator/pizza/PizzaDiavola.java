package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaDiavola extends PizzaOrderDecorator {

    public PizzaDiavola(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(15.00));
    }
    @Override
    public String getCurrency() { return super.getCurrency(); }
    @Override
    public String getDescription() {
        return super.getDescription() + " + salami picante + fresh tomato ";
    }
}

