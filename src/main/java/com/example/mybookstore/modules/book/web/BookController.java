package com.example.mybookstore.modules.book.web;

import com.example.mybookstore.modules.book.service.BookService;
import com.example.mybookstore.modules.book.domain.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return ResponseEntity.ok("Book added successfully");
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBook(@PathVariable Long bookId) {
        Book book = bookService.getBook(bookId);
        if (book != null) {
            return ResponseEntity.ok(book);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        if (!books.isEmpty()) {
            return ResponseEntity.ok(books);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}