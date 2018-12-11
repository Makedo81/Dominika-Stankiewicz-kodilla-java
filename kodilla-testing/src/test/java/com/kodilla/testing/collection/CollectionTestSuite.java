package com.kodilla.testing.collection;/*
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


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
        System.out.println("testOddNumberExterminatorNormalList()");
        //given
        ArrayList<Integer> normalList = new ArrayList<>();
            normalList.add(1);
            normalList.add(2);
            normalList.add(3);
            normalList.add(4);
            normalList.add(5);

        ArrayList<Integer> expectedList = new ArrayList<>();
            expectedList.add(2);
            expectedList.add(4);
    //when
        OddNumbersExterminator allNumbersList = new OddNumbersExterminator();
        ArrayList<Integer> result = allNumbersList.exterminate(normalList);
        //ArrayList<Integer> result = normalList.exterminate();
        //then
        Assert.assertEquals(expectedList,result);
    }
    @Test
    public void testOddNumberExterminatorEmptylList(){
        System.out.println("testOddNumberExterminatorEmptylList()");
        //given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //when
        emptyList.size();

        //then
        boolean result= emptyList.isEmpty();

        Assert.assertTrue(result);
        }
    }
*/