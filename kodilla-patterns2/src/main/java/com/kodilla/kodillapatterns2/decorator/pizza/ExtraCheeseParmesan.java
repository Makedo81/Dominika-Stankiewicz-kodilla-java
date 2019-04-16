package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseParmesan extends PizzaOrderDecorator {

        public ExtraCheeseParmesan(PizzaOrder pizzaOrder) {
            super(pizzaOrder);
        }
        @Override
        public BigDecimal getCost() {
            return super.getCost().add(new BigDecimal(4.00));
        }
        @Override
        public String getDescription() {
            return super.getDescription() + " + extra cheese: Parmesan";
        }
    }
