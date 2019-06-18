package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Board extends Prototype {

    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    List<SudokuRaw> raws = createRawsList();

    public Board() {
    }
    public List<SudokuRaw> createRawsList() {
        SudokuRaw sudokuRaw = new SudokuRaw();
        List<SudokuRaw> list = new ArrayList<>();
        for (int i = MIN_INDEX; i < MAX_INDEX; i++) {
            list.add(sudokuRaw);
        }
        return list;
    }
    public Board deepCopy() throws CloneNotSupportedException {
        Board clonedBoard = (Board) super.clone();
        clonedBoard.raws = new ArrayList<>();
        for (SudokuRaw listOfSudokuEl : createRawsList()) {
            SudokuRaw clonedList = new SudokuRaw();
            for (SudokuElement sElement : listOfSudokuEl.getSudokuElementList()) {
                clonedList.getSudokuElementList().add(sElement);
            }
            clonedBoard.getRaws().add(clonedList);
        }
        return clonedBoard;
    }

    public List<SudokuRaw> getRaws() {
        return raws;
    }

    public String toString() {
       // Input in =  new Input();
        String result = "";
       // System.out.println(makeValue());  //jak wyswietlic number na tablicy ???
        for (int k = MIN_INDEX; k < MAX_INDEX; k++) {
            result += k + 1 + "|";
            for (int n = MIN_INDEX; n < MAX_INDEX; n++) {
                result += "_"+"  "+"_";
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}




