package edu.library.librarymgmnt.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import edu.library.librarymgmnt.dto.Book;

@Service
public class LibraryService {

	private final Logger logger = LoggerFactory.getLogger(LibraryService.class);
	
	private List<Book> books = new ArrayList<>();
	
	public Boolean addBook(Book newBook) {
		logger.info("Adding a new book: " + newBook);
		return this.books.add(newBook);
	}
	
	public List<Book> getBooks() {
		logger.info("Returning list of books");
		return this.books;
	}
	
}
