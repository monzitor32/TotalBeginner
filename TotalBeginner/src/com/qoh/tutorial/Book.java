package com.qoh.tutorial;

public class Book {

	 String  title;
	 String  author;
	Person person;

	public Book(String string) {
		// TODO Auto-generated constructor stub
		this.title = string;
		this.author = "unknown author";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setPerson(Person p2) {
		this.person = p2;
	}
	
	public Person getPerson() {
		return this.person;
	}
	
	
}
