package com.manga.controller;

import com.manga.exeption.BookNotFoundException;
import com.manga.model.Book;
import com.manga.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@Validated
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "/books")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @PostMapping(value = "books")
    public Book newBook(@Valid @RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping(value = "/books/{id}")
    public Book findOne(@PathVariable(value = "id") @Min(1) Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    @GetMapping(value = "/find/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookRepository.findById(id).get();
    }


}
