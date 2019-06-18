package com.kodilla.sudoku;

import java.util.*;

public class SudokuElement {

    public static final int Empty = -1;
    public int value = Empty;
    public List<Integer> possibleElementsList = new ArrayList<>();

    public SudokuElement() {
    }

    public List<Integer> createPossibleElementsList() {
        for (int i = 1; i <= 9; i++) {
            possibleElementsList.add(value+i+1);
        }
        System.out.println(possibleElementsList);
        return  possibleElementsList;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPossibleElementsList() {
        return possibleElementsList;
    }

    public void setPossibleElementsList(List<Integer> possibleElementsList) {
        this.possibleElementsList = possibleElementsList;
    }
}
