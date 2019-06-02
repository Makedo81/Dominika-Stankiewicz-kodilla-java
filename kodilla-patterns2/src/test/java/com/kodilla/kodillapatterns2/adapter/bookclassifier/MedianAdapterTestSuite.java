package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Statistics;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        MedianAdaptee medianAdaptee = new MedianAdaptee();
        Statistics statistics = new Statistics();
        Set<Book> booksSet = new HashSet<>();
        booksSet.add(new Book("Author","Title",1900,"SF"));
        booksSet.add(new Book("Author1","Title1",2003,"D"));
        booksSet.add(new Book("Author2","Title2",1995,"SF1"));
        booksSet.add(new Book("Author3","Title3",1990,"DOK"));
        booksSet.add(new Book("Author4","Title4",2011,"KR"));
        booksSet.add(new Book("Author5","Title5",2016,"KR1"));
        booksSet.add(new Book("Author6","Title6",2019,"H"));
        Map<BookSignature, com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();

        BookSignature bookSignature = new BookSignature("SF");
        BookSignature bookSignature1 = new BookSignature("D");
        BookSignature bookSignature2 = new BookSignature("SF1");
        BookSignature bookSignature3 = new BookSignature("DOK");
        BookSignature bookSignature4 = new BookSignature("KR");
        BookSignature bookSignature5 = new BookSignature("KR1");
        BookSignature bookSignature6 = new BookSignature("H");
        books.put(
                bookSignature,
                new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(
                        "Author",
                        "Title",
                        1900));
        books.put(
                bookSignature1,
                new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(
                        "Author1",
                        "Title1",
                        2003));
        books.put(
                bookSignature2,
                new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(
                        "Author2",
                        "Title2",
                        1995));
        books.put(
                bookSignature3,
                new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(
                        "Author3",
                        "Title3",
                        1990));
        books.put(
                bookSignature4,
                new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(
                        "Author4",
                        "Title4",
                        2011));
        books.put(
                bookSignature5,
                new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(
                        "Author5",
                        "Title5",
                        2016));
        books.put(
                bookSignature6,
                new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(
                        "Author6",
                        "Title6",
                        2019));

        int result = medianAdapter.publicationYearMeadian(booksSet);
        System.out.println(result);

        //When
        Assert.assertEquals(medianAdaptee.medianPublicationYear(books),result);
        Assert.assertEquals(statistics.medianPublicationYear(books),result);
    }
}
