package com.example.mybookstore.modules.book.service;

import com.example.mybookstore.modules.book.domain.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    Book getBook(Long bookId);

    List<Book> getAllBooks();
}
