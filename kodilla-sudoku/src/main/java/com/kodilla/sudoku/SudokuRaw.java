package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SudokuRaw {

    List<SudokuElement> sudokuElementList = createSudokuElementsList();

    public SudokuRaw() {
    }

    public List<SudokuElement> createSudokuElementsList() {
        List<SudokuElement> list = new ArrayList<>();
        for (int n = 0; n < 9; n++) {
            SudokuElement sudokuElement = new SudokuElement();
            list.add(sudokuElement);
            sudokuElement.setPossibleElementsList(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).collect(Collectors.toList()));
        }
        return list;
    }

    public List<SudokuElement> getSudokuElementList() {
        return sudokuElementList;
    }
}
