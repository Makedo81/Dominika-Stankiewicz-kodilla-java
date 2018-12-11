package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

    public class WorldTestSuite {
        @Test
        public void testGetPeoplesQuantity(){

            //given
            World world =new World();
            Continent asia = new Continent();
            asia.addCountry(new Country("China",new BigDecimal(4444)));
            asia.addCountry(new Country("Russia",new BigDecimal(5555)));
            asia.addCountry(new Country("Japan",new BigDecimal(2222)));
            world.addContinent(asia);

            //then
            BigDecimal expectedValue = new BigDecimal("12221");
            Assert.assertEquals(expectedValue,world.getTotalPeopleQuantity());
        }
    }


