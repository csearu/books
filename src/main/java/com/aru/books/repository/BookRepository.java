package com.aru.books.repository;

import org.springframework.data.repository.CrudRepository;

import com.aru.books.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
