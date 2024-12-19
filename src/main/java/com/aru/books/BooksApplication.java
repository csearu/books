package com.aru.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aru.books.entity.Book;
import com.aru.books.repository.BookRepository;

@SpringBootApplication
public class BooksApplication implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book[] books = new Book[] {
				new Book("To Kill a Mockingbird", "Harper Lee",
						"A coming-of-age story set in the American South exploring themes of racism and justice through the perspective of a young girl, Scout Finch.")
		};

		for (int i = 0; i < books.length; i++) {
			bookRepository.save(books[i]);
		}

	}

}
