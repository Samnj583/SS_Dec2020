/**
 * 
 */
package com.ss.assignments.four;

import java.util.LinkedList;

/**
 * @author Samuel Johnson
 *
 */
public class ProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Store store = new Store();
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				try {
					store.stimulateProduce();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				try {
					store.stimulateConsumer();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		
		new Thread(r1).start();
		new Thread(r2).start();

	}

}


/**
 * Store class has the methods that each thread will call for consumer and producer
 */
class Store{
	private int maxStock = 5;
	private LinkedList<Integer> stock = new LinkedList<>();
	private int inStock = 1;
	
	/**
	 * Starts the process of stocking the store
	 */
	public void stimulateProduce() throws InterruptedException {
		
		while(true) {
			synchronized(this) {
				while(stock.size() == maxStock) {
					wait();
				}
				
				System.out.println("There has put product " + inStock + " in the store");
				
				stock.add(inStock);
				inStock++;
				
				notify();
				
				
			}
			if(stock.size() <=2) {
				Thread.sleep(500);
			}
			else {
				Thread.sleep(1300);
			}
		}
	}
	
	
	/**
	 * Starts the process of consumers buying
	 */
	public void stimulateConsumer() throws InterruptedException {
		int count = 1;
		while(true) {
			synchronized(this) {
				while(stock.size() == 0) {
					wait();
				}
				
				count = stock.removeFirst();
				inStock--;
				System.out.println("The consumer has purchased product " + count + " from the store");
				
				notify();
				
				
			}
			Thread.sleep(1000);
		}
	}
}
