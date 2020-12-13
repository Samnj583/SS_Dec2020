/**
 * 
 */
package com.ss.assignments.four;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

/**
 * @author Samuel Johnson
 *
 */
public class LineTest {
	Line lineOne = new Line(1.0, 2.0, 2.0, 3.0);
	Line lineTwo = new Line(1.0, 5.0, 2.0, 6.0);
	Line lineThree = new Line(0.0, 1.0, 1.0, 1.0);
	Line lineFour = new Line(0.0, 1.0, 0.0, 2.0);

	
	/**
	 * Tests if the getSlope() method returns a correct answer
	 */
	@Test
	public void testGetSlope() {
		assertEquals(1, lineOne.getSlope(), 0.0001);
	}
	
	/**
	 * Tests to see if the getDistance() method returns a correct answer
	 */
	@Test
	public void testGetDistance() {
		assertEquals(1, lineThree.getDistance(), 0.001);
	}
	
	/**
	 * Tests to see if testParallel() method can return true
	 */
	@Test
	public void testParallelToTrue() {
		assertEquals(true, lineOne.parallelTo(lineTwo));
	}
	
	/**
	 * Tests to see if testParallel() method can return false
	 */
	@Test
	public void testParallelToFalse() {
		assertEquals(false, lineOne.parallelTo(lineThree));
	}
}
