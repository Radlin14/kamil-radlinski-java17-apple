package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("My Library");
        library.getBooks().add(new Book("Hobbit", " J.R.R. Tolkien", LocalDate.of(1937, 3, 3)));
        library.getBooks().add(new Book("Miecz przeznaczenia", "A.Sapkowski", LocalDate.of(1992, 7, 1)));
        library.getBooks().add(new Book("Krew elfów", "A.Sapkowski", LocalDate.of(1994, 12, 14)));

        //When
        Library shallowCopiedLibrary = null;
        Library deepCopiedLibrary = null;

        try {
            shallowCopiedLibrary = library.shallowCopy();
            deepCopiedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        library.getBooks().add(new Book("Pani Jeziora", "A.Sapkowski", LocalDate.of(1999, 1, 21)));

        //Then
        assertEquals(4, library.getBooks().size());
        assert shallowCopiedLibrary != null;
        assertEquals(4, shallowCopiedLibrary.getBooks().size());
        assert deepCopiedLibrary != null;
        assertEquals(3, deepCopiedLibrary.getBooks().size());
        assertNotEquals(library.getBooks(), deepCopiedLibrary.getBooks());
    }
}