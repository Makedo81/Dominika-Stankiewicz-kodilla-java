package com.kodilla.kodillapatterns2.decorator.taxiportal;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(5),calculatedCost);
    }
    @Test
    public void testBasicTaxiOrderGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Drive a course",description);
    }
    @Test
    public void testBasicTaxiNetworkGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(40), theCost);
    }
//    @Test
//    public void testBasicTaxiNetworkGetDescription() {
//        //given
//        TaxiOrder theOrder = new BasicTaxiOrder();
//        theOrder = new TaxiNetworkOrderDecorator(theOrder);
//        //when
//        String description = theOrder.getDescription();
//        //then
//        assertEquals("Drive a course by Taxi Network", description);
//    }
    @Test
    public void testUberWithTwoChildSeatsGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(29),theCost);
    }
    @Test
    public void testUberWithTwoChildSeatsGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getDescription());

        //when
        String  description = theOrder.getDescription();
        //then
        assertEquals("Drive a course by Uber Network  + child seat  + child seat",description);
    }
}