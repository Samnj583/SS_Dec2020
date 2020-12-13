/**
 * 
 */
package com.ss.assignments.four;

/**
 * @author Samuel Johnson
 *
 */
public class ThreadDeadlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lock lockOne = new Lock(1, "This is lock one");
		Lock lockTwo = new Lock(2, "This is lock two");
		
		
		System.out.println("Start Program");
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (lockOne) {
						Thread.sleep(100);
						synchronized (lockTwo) {
							System.out.println("Thread One Run");
						}
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (lockTwo) {
						Thread.sleep(100);
						synchronized (lockOne) {
							System.out.println("Thread Two Run");
						}
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		};
		new Thread(r1).start();
		new Thread(r2).start();
		System.out.println("End Program");

	}

}


/**
 * This class is a lock
 */
class Lock {
	private int id;
	private String description;
	
	
	/**
	 * @param id, str
	 */
	Lock(int id, String str){
		this.id = id;
		this.description = str;
	}
}
