package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classiefier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classiefier {

    @Override
    public int publicationYearMeadian(Set<Book> libraryaBookSet) {

        Map<BookSignature, com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book> libraryaBooksMap = new HashMap<>();
        for (Book bookLibrarya : libraryaBookSet) {
            libraryaBooksMap .put(new BookSignature(

                            bookLibrarya.getSignature()),

                    new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(
                            bookLibrarya.getAuthor(),
                            bookLibrarya.getTitle(),
                            bookLibrarya.getPublicationYear()));
        }
        return medianPublicationYear(libraryaBooksMap );
    }
}
