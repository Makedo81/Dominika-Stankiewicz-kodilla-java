package com.kodilla.testing.collection;
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

        ArrayList<Integer> normalList = new ArrayList<>();
        Random generator = new Random();
        for(int n=0;n<10;n++){
            normalList.add(generator.nextInt(10));
        }
        OddNumbersExterminator evenNumbersList = new OddNumbersExterminator();
        ArrayList<Integer> result = evenNumbersList.exterminate(ArrayList<Integer>normalList);
        Assert.assertEquals(normalList.get(generator.nextInt(10))%2,result);
    }
    @Test
    public void testOddNumberExterminatorEmptylList(){


        }
    }
