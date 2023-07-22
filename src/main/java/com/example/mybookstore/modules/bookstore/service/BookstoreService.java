package com.example.mybookstore.modules.bookstore.service;

import com.example.mybookstore.modules.bookstore.domain.Bookstore;

public interface BookstoreService {
    void addBookstore(Bookstore bookstore);

    Bookstore getBookstore(Long bookstoreId);
}
