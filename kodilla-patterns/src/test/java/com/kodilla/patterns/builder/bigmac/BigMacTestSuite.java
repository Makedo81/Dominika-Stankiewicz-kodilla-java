package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testBigMac() {
        //given
        BigMac bigMac = new BigMac.BigMacBuilder()

                .setBun("sesam")
                .setBun("plain")
                .setBurgers(2)
                .setSauceType("mild")
                .setSauceType("spicy")
                .build();

        System.out.println(bigMac);
        //When
        int numberOfSouces = bigMac.getSauce().size();
        int numberOfBurgers = bigMac.getBurgers();
        //Then
        Assert.assertEquals(2, numberOfSouces);
        Assert.assertEquals(2, numberOfBurgers);
    }
}