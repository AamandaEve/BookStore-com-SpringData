package com.learning.amanda.controllers;

import com.learning.amanda.model.dtos.BookDTO;
import com.learning.amanda.model.entities.Book;
import com.learning.amanda.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookstore/books")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> savebook(@RequestBody BookDTO bookDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.saveBook(bookDto));
    }

}
