package com.qoh.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
	//	fail("Not yet implemented");
		
		Person p1 = new Person();
		assertEquals("unknown name",p1.getName());
		assertEquals(3,p1.getMaximumBooks());		
		
		
	}

	@Test
	public void testSetName() {
		//fail("Not yet implemented");
		Person p2 = new Person();
		assertEquals("unknown name",p2.getName());
		p2.setName("My new name");
		assertEquals("My new name",p2.getName());
				
		
	}

	@Test
	public void testSetMaximumBooks() {
		//fail("Not yet implemented");
		Person p3 = new Person();
		p3.setMaximumBooks(99);
		assertEquals(99,p3.getMaximumBooks());		
		

		
	}

	@Test
	public void testToString(){
		
		Person p4 = new Person();
		p4.setMaximumBooks(200);
		p4.setName("Jakes, John");
		String testString = "Jakes, John has 200 books in his list";
		assertEquals(testString, p4.toString());
		
	}
	
	
}
