package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> normalList) {

        for (int i = 0; i < normalList.size(); i++) {

            int numberToExaminate = normalList.get(i);

            if (numberToExaminate % 2 == 0) {
                ArrayList<Integer> evenNumbers=new ArrayList<>();
                evenNumbers.add(numberToExaminate);
                System.out.println(evenNumbers);
            } else {
                normalList.remove(numberToExaminate);
            }
        }
    }
}