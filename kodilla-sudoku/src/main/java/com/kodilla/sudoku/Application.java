package com.kodilla.sudoku;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Board board = new Board();
        System.out.println("Type x, y, value");
        Input input = new Input();
        for (int i = 0; i < 2; i++) {  // NIE DZIALA WYSWIETLANIE DANYCH
        input.makeValue(board);
        }

        System.out.println("Type SUDOKU ");  // NIE DZIALA - do poprawy
        Scanner s = new Scanner(System.in);
        boolean sudoku = s.hasNext();
        if(s.nextLine().equals("sudoku") && sudoku){
            boolean gameFinished = false;
            while (!gameFinished) {
                SudokuGame theGame = new SudokuGame();
                gameFinished = theGame.resolveSudoku(board);
            }
        }else System.out.println("Type: sudoku");
        s.hasNext();
    }
}
