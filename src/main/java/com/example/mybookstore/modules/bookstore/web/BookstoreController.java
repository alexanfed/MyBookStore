package com.example.mybookstore.modules.bookstore.web;

import com.example.mybookstore.modules.bookstore.domain.Bookstore;
import com.example.mybookstore.modules.bookstore.service.BookstoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookstores")
public class BookstoreController {
    private final BookstoreService bookstoreService;

    public BookstoreController(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    @PostMapping
    public ResponseEntity<String> addBookstore(@RequestBody Bookstore bookstore) {
        bookstoreService.addBookstore(bookstore);
        return ResponseEntity.ok("Bookstore added successfully");
    }

    @GetMapping("/{bookstoreId}")
    public ResponseEntity<Bookstore> getBookstore(@PathVariable Long bookstoreId) {
        Bookstore bookstore = bookstoreService.getBookstore(bookstoreId);
        if (bookstore != null) {
            return ResponseEntity.ok(bookstore);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
