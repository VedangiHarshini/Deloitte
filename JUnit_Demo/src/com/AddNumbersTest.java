package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddNumbersTest {
	AddNumbers numbers = new AddNumbers();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	    numbers = null;
	}

	@Test
	void testSum() {
		assertEquals(20, numbers.sum(10,5,5));
		
	}
	@Test
	void testSum1() {
		
		assertEquals(30, numbers.sum(10,5,5));
		
	}
	

}
