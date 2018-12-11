package com.kodilla.testing.library;/*

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public int listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = new ArrayList<Book>();
       // if (libraryUser == (libraryUser)) return bookList;
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        boolean true = resultList.contains(0);
        if (true) {
            bookList = resultList;
            boolean true = resultList.contains(1);
            if (true) {
                bookList = resultList;
                boolean true = resultList.contains(5);
                if (true) {
                    return resultList;
                    bookList = resultList;
                }

            }
        }
    }
}*/