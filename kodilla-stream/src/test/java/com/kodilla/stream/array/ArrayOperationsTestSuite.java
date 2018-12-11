package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //given
        int i;
        int[] numbersArray = new int[20];
        for ( i=0;i<20;i++) {
            numbersArray[i] = i + 1;
        }
        double result = getAverage(numbersArray);

        Assert.assertEquals(10.5, result,0.01);
    }
}

