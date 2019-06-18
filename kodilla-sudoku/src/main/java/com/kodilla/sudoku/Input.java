package com.kodilla.sudoku;

import java.util.Scanner;

public class Input {

    Board board = new Board();

    public Integer makeValue(Board board) {
            SudokuElement v ;
            Scanner inputValue = new Scanner(System.in);
            System.out.println("Type x");
            int c = inputValue.nextInt();
            System.out.println("Type y");
            int s = inputValue.nextInt();
            System.out.println("Type value");
            int f = inputValue.nextInt();
            v = board.getRaws().get(c).getSudokuElementList().get(s);
            v.setValue(f);
            if (board.getRaws().get(c).getSudokuElementList().get(s).getValue() == f) {
                 System.out.println("Number " + board.getRaws().get(c).getSudokuElementList().get(s).getValue()+" set on board");
            }
        System.out.println(board);
        return v.getValue();
    }
}
