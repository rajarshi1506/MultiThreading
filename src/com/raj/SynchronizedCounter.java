package com.raj;

public class SynchronizedCounter extends Counter{
	/*
	 * incremental variable
	 */
	private int counter;

	public void increment() {
		synchronized (this) {
			counter++;
			System.out.println(Thread.currentThread().getName() + " incremented counter to:::" + counter);
		}
	}

	public int getCounter() {
		return counter;
	}

}
