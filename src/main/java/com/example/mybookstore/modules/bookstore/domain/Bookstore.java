package com.example.mybookstore.modules.bookstore.domain;

import com.example.mybookstore.modules.book.domain.Book;

import java.util.List;

public class Bookstore {
    private Long bookstoreId;
    private List<Book> books;

    public Bookstore(Long bookstoreId, List<Book> books) {
        this.bookstoreId = bookstoreId;
        this.books = books;
    }

    public Long getBookstoreId() {
        return bookstoreId;
    }

    public void setBookstoreId(Long bookstoreId) {
        this.bookstoreId = bookstoreId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
