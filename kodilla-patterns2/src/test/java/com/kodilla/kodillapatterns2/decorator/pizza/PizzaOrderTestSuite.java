package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaMargheritaOrder() {
        //given
        PizzaOrder order = new BasicPizzaOrder();
        //order = new PizzaMarinara(order);
        order = new ExtraCheeseGranaPadano(order);
        //when
        String description = order.getDescription();
        BigDecimal calculatedCost = order.getCost();
        String currency = order.getCurrency();
        System.out.println(calculatedCost+currency);
        System.out.println(description);
        //then
        assertEquals("Pizza margherita with tomato sauce  + extra cheese: GranaPadano",description);
        assertEquals(new BigDecimal(18),calculatedCost);
    }
    @Test
    public void testPizzaMarinaraOrder() {
        //given
        PizzaOrder order = new BasicPizzaOrder();
        order = new PizzaMarinara(order);
        order = new ExtraCheeseGranaPadano(order);
        //when
        BigDecimal calculatedCost = order.getCost();
        String currency = order.getCurrency();
        System.out.println(calculatedCost+currency);
        String description = order.getDescription();
        System.out.println(description);
        //then
        assertEquals("Pizza margherita with tomato sauce  + aglio + origano + extra cheese: GranaPadano",description);
        assertEquals(new BigDecimal(28),calculatedCost);
    }

    @Test
    public void testPizzaDiavolaOrder() {
        //given
        PizzaOrder order = new BasicPizzaOrder();
        order = new PizzaDiavola(order);
        order = new ExtraCheeseParmesan(order);
        //when
        BigDecimal calculatedCost = order.getCost();
        String currency = order.getCurrency();
        System.out.println(calculatedCost+currency);
        String description = order.getDescription();
        System.out.println(description);
        //then
        assertEquals("Pizza margherita with tomato sauce  + salami picante + fresh tomato  + extra cheese: Parmesan",description);
        assertEquals(new BigDecimal(34),calculatedCost);
    }

}
