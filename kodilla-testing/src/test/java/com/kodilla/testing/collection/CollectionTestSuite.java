package com.kodilla.testing.collection;/*
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {

    @Before
        public void before(){
            System.out.println ("Test case:begin");
    }
    @After
        public void after(){
            System.out.println ("Test case:end");
        }
    @Test
    public void testOddNumberExterminatorNormalList(){
        //given
        ArrayList<Integer> normalList = new ArrayList<>();
        Random generator = new Random();
        for(int n=0;n<10;n++){
            normalList.add(generator.nextInt(10));
        }
        OddNumbersExterminator evenNumbersList = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = evenNumbersList.exterminate(normalList);
        ArrayList<Integer> expectedList = evenNumbersList.exterminate(normalList).size();
        //then
        Assert.assertEquals(expectedList,result.size());
       // Assert.assertNotEquals(normalList,result);
    }
    @Test
    public void testOddNumberExterminatorEmptylList(){
        //given
        ArrayList<Integer> normalList = new ArrayList<>();
        //when
        Random generator = new Random();
        for(int n=0;n<10;n++){
            normalList.add(generator.nextInt(10));
        }
        //then
        //boolean result=normalList.add(generator.nextInt(10));
        //Assert.assertTrue(result);
        boolean result=normalList.isEmpty();
        Assert.assertFalse(result);
        }
    } */
