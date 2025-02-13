package com.library;


//Sub-class of Book
public class FictionBook extends Book{
	
	public String category = "Fiction";
	public String genre;
	
	public FictionBook(String title, String author, String isbn, String genre) {
		super(title, author, isbn);
		this.genre = genre;
	}
	
	@Override
	public String getCategory() {
		return category;
	}

}
