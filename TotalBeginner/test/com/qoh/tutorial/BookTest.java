package com.qoh.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public void testBook() {
		//fail("Not yet implemented");
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.author );
		
	}

	@Test	
	public void testGetPerson() {
		Book b2 = new Book("The Orient Express");
		Person p2 = new Person();
		p2.setName("Keith Laumer");
		
		//this will say hwo the book is lloaned to
		
		b2.setPerson(p2);
		
		//gets the name of the person who has the book
		
		Person testPerson = b2.getPerson();
		String testName = testPerson.getName();
		
		assertEquals("Keith Laumer", testName);
		
		
	}
	
	
}
