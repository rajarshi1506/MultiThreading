package com.raj;

public class Counter {

/*
 * incremental variable
 */
	private int counter;
	
	public void increment() {
		counter++;
		System.out.println(Thread.currentThread().getName()+" incremented counter to:::"+counter);
	}
	
	public int getCounter() {
		return counter;
	}
	
}
