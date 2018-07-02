package edu.library.librarymgmnt.dto;

import org.springframework.stereotype.Component;

//@Data
@Component
public class Book {

	//@Setter
	private int bookId;
	
	//@Setter
	private String bookDescription; 
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookDescription=" + bookDescription + "]";
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	
	
}
