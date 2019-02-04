package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {

    @Test
    public void testToString() {
        //creating the TaskList for toDos
        TasksList listToDo = new TasksList("To do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To do Task number" + n)));


        //creating the TaskList for doneTask
        TasksList listDone = new TasksList("Done Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Task number " + n)));

        //creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        //  board.getLists().add(listInProgress);
        board.getLists().add(listDone);
        System.out.println(board);

        //making a shallow clone of object board
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
           // System.out.println(e);
            e.printStackTrace();
        }
            System.out.println(board);
            System.out.println(clonedBoard);

        //When
        board.getLists().remove(listToDo);
        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, clonedBoard.getLists().size());
    }
}
