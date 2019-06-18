package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuGame {

    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;

    public boolean resolveSudoku (Board board){
        if(findPossibleElementInRaw(board)) {
            if(findPossibleElementInColumn(board)) {
                findPossibleElementInSection(board);
            }
        }else  return  false;
        System.out.println("Sudoku resolved");
        return true;
    }

    public boolean setValue(SudokuElement sudokuElement) {
        List<Integer> numbers = sudokuElement.getPossibleElementsList();
        if (numbers.size() == 1) {  //dodac warunek jezeli possible element jest w innym polu
            throw new IllegalStateException("This number is not correct");
        } else {
            sudokuElement.setValue(numbers.get(0));
        }
        if (numbers.size() > 1) {   //GDY MA wiecej niz jedna  LICZBe TO WYBIERAMY pierwsza WPISUJEMY ,NASTEPNIE USUWAMY WYBRANA Z POSSIBLE W RAW , COLUMN I SEKCJI
            createListOfNumbersToEliminate(sudokuElement);
        }
        return true;
    }

    public boolean createListOfNumbersToEliminate(SudokuElement sudokuElement) {
        List<Integer> numbersToEliminate = new ArrayList<>();
       // System.out.println("1");
        if (sudokuElement.getValue() != -1) {  //pobiera kazda komorke w bloku nr1, sprawdza czy pusta , jezeli nie to dodaje element do listy
            System.out.println("2");
            numbersToEliminate.add(sudokuElement.getValue());
            System.out.println("3" + numbersToEliminate.get(0)+numbersToEliminate.get(1));
            if (sudokuElement.getValue() == -1) {
                for (int n : numbersToEliminate) {
                    sudokuElement.getPossibleElementsList().remove(n);
                    System.out.println("4");
                    setValue(sudokuElement);
                    if (setValue(sudokuElement)) {
                        numbersToEliminate.add(sudokuElement.getValue());
                        System.out.println("5");
                    }
                }
            }
        }
      return true;
    }

    public boolean findPossibleElementInSection(Board board) {
        for (int i = 1; i <= 3; i++) {   //sprawdzamy 3 sekcje (3x3 bloki w rzedzie)
            for (int y = MIN_INDEX; y < 3; y++) {   //dla 1 bloku w sekcji
                for (int x = MIN_INDEX; x < 3; x++) {
                    final int valueForKomorka = board.getRaws().get(y).getSudokuElementList().get(x).getValue();
                    final SudokuElement field = board.getRaws().get(y).getSudokuElementList().get(x);
                    final List<Integer> onlyPossibility = board.getRaws().get(y).getSudokuElementList().get(x).getPossibleElementsList();
                    createListOfNumbersToEliminate(field);
                }
            }
            for (int y = MIN_INDEX + 3; y < 3; y++) {//dla 2 bloku w sekcji
                for (int x = MIN_INDEX + 3; x < 3; x++) {
                    final int valueForKomorka = board.getRaws().get(y).getSudokuElementList().get(x).getValue();
                    final SudokuElement komorka = board.getRaws().get(y).getSudokuElementList().get(x);
                    final List<Integer> onlyPossibility = board.getRaws().get(y).getSudokuElementList().get(x).getPossibleElementsList();
                    createListOfNumbersToEliminate(komorka);
                }
            }
            for (int y = MIN_INDEX + 6; y < 3; y++) {  //dla 3 bloku w sekcji
                for (int x = MIN_INDEX + 6; x < 3; x++) {
                    final int valueForKomorka = board.getRaws().get(y).getSudokuElementList().get(x).getValue();
                    final SudokuElement komorka = board.getRaws().get(y).getSudokuElementList().get(x);
                    final List<Integer> onlyPossibility = board.getRaws().get(y).getSudokuElementList().get(x).getPossibleElementsList();
                }
            }
        }
        return false;
    }

    public boolean findPossibleElementInColumn(Board board) {
       // List<Integer> numbers = sudokuElement.getPossibleElementsList();
        for (int y = MIN_INDEX; y < MAX_INDEX; y++) {
            for (int x = MIN_INDEX; x < MAX_INDEX; x++) {
                List<SudokuElement> raw = board.getRaws().get(y).getSudokuElementList();
                final int valueForCurrentField = board.getRaws().get(x).getSudokuElementList().get(y).getValue();
                final SudokuElement valueForCurrent = board.getRaws().get(x).getSudokuElementList().get(y);
                final List<Integer> onlyPossibility = board.getRaws().get(x).getSudokuElementList().get(y).getPossibleElementsList();
                createListOfNumbersToEliminate(valueForCurrent);
            }
        }
        return true;
    }

    public boolean findPossibleElementInRaw(Board board) {
        for (int y = MIN_INDEX; y < MAX_INDEX; y++) {
            for (int x = MIN_INDEX; x < MAX_INDEX; x++) {
                List<SudokuElement> raw = board.getRaws().get(y).getSudokuElementList();
                final int valueForCurrentField = board.getRaws().get(y).getSudokuElementList().get(x).getValue();
                final SudokuElement sudoku = board.getRaws().get(y).getSudokuElementList().get(x);
                final SudokuElement valueForCurrent = board.getRaws().get(y).getSudokuElementList().get(x);
                final List<Integer> onlyPossibility = board.getRaws().get(y).getSudokuElementList().get(x).getPossibleElementsList();
                createListOfNumbersToEliminate(valueForCurrent);
                }
            }
            return true;
        }
}
