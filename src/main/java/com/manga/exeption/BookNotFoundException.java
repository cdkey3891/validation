package com.manga.exeption;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super("Book id not found: "+id);
    }
}
