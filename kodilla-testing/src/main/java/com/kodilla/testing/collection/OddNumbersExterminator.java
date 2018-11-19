package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> normalList) {

        ArrayList<Integer> evenNumbers=null;
        for (int i = 0; i < normalList.size(); i++) {

            int numberToExaminate = normalList.get(i);

            if (numberToExaminate % 2 == 0) {
                evenNumbers = new ArrayList<>();
                evenNumbers.add(numberToExaminate);
            }
        }
        return evenNumbers;
    }
}
