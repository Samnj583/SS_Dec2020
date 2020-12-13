/**
 * 
 */
package com.ss.assignments.four;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * @author Samuel Johnson
 *
 */
public class DoubleCheckedLockSingletonTest {
	
	
	/**
	 * This tests if getInstance() works
	 *
	 */
	@Test
	public void testGettingInstance() {
		DoubleCheckedLockSingleton singleton = null;
		assertNotEquals(null, singleton.getInstance());
	}
	
	/**
	 * This method tests if two threads deadlock
	 *
	 */
	@Test
	public void testTwoThreads() {
//		DoubleCheckedLockSingleton singleton = null;
		Runnable t1 = new Runnable() {

			@Override
			public void run() {

					DoubleCheckedLockSingleton threadOneInstance = DoubleCheckedLockSingleton.getInstance();
					assertNotEquals(null, threadOneInstance);
					System.out.println("Thread 1 running");
			}
		};
		Runnable t2 = new Runnable() {

			@Override
			public void run() {

					DoubleCheckedLockSingleton threadTwoInstance = DoubleCheckedLockSingleton.getInstance();
					assertNotEquals(null, threadTwoInstance);
					System.out.println("Thread 2 running");
			}
		};
		new Thread(t1).start();
		new Thread(t2).start();
	}
}
