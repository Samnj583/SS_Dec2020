package com.ss.assignments.five;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class DateTimeAPIPracticeTest {

	@Test
	public void returnMonthSizeTest() {
		DateTimeAPIPractice dt = new DateTimeAPIPractice();
		assertEquals(31, dt.returnMonthSize(2020, 12));
	}
	
	@Test
	public void returnMondaysTest() {
		DateTimeAPIPractice dt = new DateTimeAPIPractice();
		assertEquals(4, dt.returnMondays(2020, 2));
	}
	
	@Test
	public void isFridayThirteenthTestTrue() {
		DateTimeAPIPractice dt = new DateTimeAPIPractice();
		assertEquals(true, dt.isFridayThirteenth(2020, 11, 13));
	}
	
	@Test
	public void isFridayThirteenthTestFalse() {
		DateTimeAPIPractice dt = new DateTimeAPIPractice();
		assertEquals(false, dt.isFridayThirteenth(2020, 12, 13));
	}
}
