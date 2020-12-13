/**
 * 
 */
package com.ss.assignments.four;

/**
 * @author Samuel Johnson
 *
 */
public class DoubleCheckedLockSingleton {

	private static DoubleCheckedLockSingleton instance = null;
	
	private DoubleCheckedLockSingleton() {
		
	}
	
	/**
	 * This method checks to see if instance is null twice, the second time using a lock
	 *
	 */
	public static DoubleCheckedLockSingleton getInstance() {
			if(instance == null) {
				synchronized(DoubleCheckedLockSingleton.class) {
					if(instance == null) {
						instance = new DoubleCheckedLockSingleton();
					}
				}
			}
		return instance;
	}

}
