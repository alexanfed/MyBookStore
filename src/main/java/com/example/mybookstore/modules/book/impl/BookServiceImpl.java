package com.example.mybookstore.modules.book.impl;

import com.example.mybookstore.modules.book.domain.Book;
import com.example.mybookstore.modules.book.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private List<Book> books;

    public BookServiceImpl(List<Book> books) {
        this.books = books;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Book getBook(Long bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}
