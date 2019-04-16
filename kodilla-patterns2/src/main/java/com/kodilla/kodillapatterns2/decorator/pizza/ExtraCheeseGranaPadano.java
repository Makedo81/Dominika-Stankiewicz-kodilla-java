package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseGranaPadano extends PizzaOrderDecorator {

    public ExtraCheeseGranaPadano(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.00));
    }
    @Override
    public String getCurrency() {
        return super.getCurrency();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + extra cheese: GranaPadano";
    }
}
