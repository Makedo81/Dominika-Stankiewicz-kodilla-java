package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Book book1  = new Book("Title One","Dirk", LocalDate.of(2008,11,2));
        Book book2  = new Book("Title Two","Dominika",LocalDate.of(1999,12,4));
//
//        Set<Book> books = new HashSet<>();
//        books.add(book1);
//        books.add(book2);


        //When
        Library library = new Library ("Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
//        library.setBooks(books);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library shallow copy");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);


        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(deepClonedLibrary);

        //when
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(1,library.books.size());
        Assert.assertEquals(1,clonedLibrary.books.size());
        Assert.assertEquals(2,deepClonedLibrary.books.size());
        Assert.assertEquals((clonedLibrary.getBooks()),library.getBooks());
        Assert.assertNotEquals((deepClonedLibrary.getBooks()),library.getBooks());
    }
}
