package com.aru.books.service;

import java.util.List;
import java.util.Optional;

import com.aru.books.entity.Book;
import com.aru.books.exception.BookNotFoundException;
import com.aru.books.repository.BookRepository;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    BookRepository bookRepository;

    @Override
    public Book getBook(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) {
            return book.get();
        } else {
            throw new BookNotFoundException(id);
        }
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);

    }

    @Override
    public List<Book> getBooks() {
        return (List<Book>) bookRepository.findAll();
    }
}
