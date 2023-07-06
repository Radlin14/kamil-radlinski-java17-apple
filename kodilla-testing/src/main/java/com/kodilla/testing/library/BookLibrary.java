package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> booksInHands = new ArrayList<>();
        if (libraryDatabase.listBooksInHandsOf(libraryUser).size() == 0) return booksInHands;
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        booksInHands = resultList;
        return booksInHands;
    }
}
