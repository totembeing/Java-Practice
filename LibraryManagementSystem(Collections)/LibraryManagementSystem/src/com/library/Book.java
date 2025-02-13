package com.library;

//Base abstract class
public abstract class Book {

	//Instance variables
	/*ISBN -> International Standard Book Number
	 * ISBN-10 (10 digit format): 0-306-40615-2
	 * ISBN-13 (13 digit format): 978-3-16-148410-0*/
	public String title;
	public String author;
	private String isbn;
	
	//Constructor to initialize instance variables 
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		setIsbn(isbn);
		
	}
	
	//Getter and setter for isbn
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public abstract String getCategory();
	
	public void printDetails() {
		System.out.printf("Title: %s | Author: %s | ISBN: %s ", title, author, getIsbn());
	}
}
