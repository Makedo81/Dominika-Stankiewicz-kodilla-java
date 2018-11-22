package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> allNumbersList) {

        ArrayList<Integer> evenNumbers= new ArrayList<>();
        for (int i = 0; i < allNumbersList.size(); i++) {

            int numberToExaminate = allNumbersList.get(i);

            if (numberToExaminate % 2 == 0) {
                evenNumbers.add(numberToExaminate);
            }
        }
        return evenNumbers;
    }
}
