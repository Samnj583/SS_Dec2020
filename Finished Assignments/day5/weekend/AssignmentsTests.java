package com.ss.assignments.weekend;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AssignmentsTests {

	@Test
	public void testIsOdd() {
		AssignmentOne assignOne = new AssignmentOne();
		assertEquals(true, assignOne.isOdd().express(5));
	}
	
	@Test
	public void testIsNotOdd() {
		AssignmentOne assignOne = new AssignmentOne();
		assertEquals(false, assignOne.isOdd().express(4));
	}
	
	@Test
	public void testIsPrime() {
		AssignmentOne assignOne = new AssignmentOne();
		assertEquals(true, assignOne.isPrime().express(13));
	}
	
	@Test
	public void testIsNotPrime() {
		AssignmentOne assignOne = new AssignmentOne();
		assertEquals(false, assignOne.isPrime().express(21));
		assertEquals(false, assignOne.isPrime().express(1));
	}
	
	@Test
	public void testIsPalindrome() {
		AssignmentOne assignOne = new AssignmentOne();
		assertEquals(true, assignOne.isPalindrome().express(1001));
	}
	
	@Test
	public void testIsNotPalindrome() {
		AssignmentOne assignOne = new AssignmentOne();
		assertEquals(false, assignOne.isPalindrome().express(1101));
	}
	
}
