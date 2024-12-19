package com.aru.books.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(Long id) {
        super("Book id '" + id + "' does not exist in our records");
    }

}
