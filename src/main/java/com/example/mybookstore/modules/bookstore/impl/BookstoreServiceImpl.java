package com.example.mybookstore.modules.bookstore.impl;

import com.example.mybookstore.modules.bookstore.service.BookstoreService;
import com.example.mybookstore.modules.bookstore.domain.Bookstore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookstoreServiceImpl implements BookstoreService {

    private List<Bookstore> bookstores;

    @Override
    public void addBookstore(Bookstore bookstore) {
        this.bookstores = new ArrayList<>();
    }

    @Override
    public Bookstore getBookstore(Long bookstoreId) {
        for (Bookstore bookstore : bookstores) {
            if (bookstore.getBookstoreId().equals(bookstoreId)) {
                return bookstore;
            }
        }
        return null;
    }
}
