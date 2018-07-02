package edu.library.librarymgmnt.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.library.librarymgmnt.dto.Book;
import edu.library.librarymgmnt.service.LibraryService;

@RestController 
@RequestMapping("/library")
public class LibraryController {
	
	private final Logger logger = LoggerFactory.getLogger(LibraryController.class);
	@Autowired
	LibraryService libraryService;
	
	//@RequestMapping(method=RequestMethod.GET, value="/books", produces="application/json")
	@GetMapping(value="/books", produces="application/json")
	public List<Book> getBooks() {
		logger.info("Requesting the list of books");
		return libraryService.getBooks();
	}
	
	//@RequestMapping(method=RequestMethod.POST, value="/book", consumes="application/json", produces="application/json" )
	@PostMapping(value="/book", consumes="application/json", produces="application/json")
	public Boolean addBook(@RequestBody Book newBook) {
		logger.info("Adding a new book: " + newBook);
		return libraryService.addBook(newBook);
	}
}
