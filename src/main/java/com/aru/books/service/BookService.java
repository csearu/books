package com.aru.books.service;

import java.util.List;

import com.aru.books.entity.Book;

public interface BookService {
    Book getBook(Long id);

    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> getBooks();
}
