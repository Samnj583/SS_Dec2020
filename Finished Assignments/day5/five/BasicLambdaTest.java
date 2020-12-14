package com.ss.assignments.five;

import org.junit.jupiter.api.Test;

public class BasicLambdaTest {

	@Test
	public void sortByLengthTest() {
		BasicLambdas bl = new BasicLambdas();
		bl.sortByLength();
	}
	
	@Test
	public void reverseSortByLengthTest() {
		BasicLambdas bl = new BasicLambdas();
		bl.reverseSortByLength();
	}
	
	@Test
	public void byLetterETest() {
		BasicLambdas bl = new BasicLambdas();
		bl.byLetterE();
	}
	
	@Test
	public void byLetterERedoneTest() {
		BasicLambdas bl = new BasicLambdas();
		bl.byLetterERedone();
	}
	
	@Test
	public void addEvenOrOddTest() {
		BasicLambdas bl = new BasicLambdas();
		bl.addEvenOrOdd();
	}
	
//	@Test
//	public void searchTest(){
//		BasicLambdas bl = new BasicLambdas();
//	}
}
