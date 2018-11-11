package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.Random;

public class TestingMain {
    public static void main(String[] args){

        ArrayList<Integer> normalList = new ArrayList<>();
        Random generator = new Random();
        for(int n=0;n<10;n++){
            normalList.add(generator.nextInt(10));
        }
    }
}
