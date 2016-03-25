package com.qoh.tutorial;

public class Person {
	
	// fields
	private String name;
	private int maximumBooks;
	
	
	//constru
	
	public Person() {
		name = "unknown name";
		maximumBooks = 3;
	}

	public String getName() {
		return name;
	}
	
public void setName(String anynamehere){
	this.name = anynamehere;
}

public int getMaximumBooks() {
	return maximumBooks;
}

public void setMaximumBooks(int maximumBooks) {
	this.maximumBooks = maximumBooks;
}
	
@Override
public String toString() {
	return this.getName() + " haas " + this.getMaximumBooks() + " books in his list";
}


}
	
