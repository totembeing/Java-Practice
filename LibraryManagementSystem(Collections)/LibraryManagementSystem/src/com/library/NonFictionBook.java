package com.library;

//Sub-class of Book
public class NonFictionBook extends Book{
	
	public String category = "Non-Fiction";
	public String subject;
	
	public NonFictionBook(String title, String author, String isbn, String subject) {
		super(title, author, isbn);
		this.subject = subject;
	}
	
	@Override
	public String getCategory() {
		return category;
	}
	
}
