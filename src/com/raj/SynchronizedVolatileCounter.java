package com.raj;

public class SynchronizedVolatileCounter extends Counter {
	/*
	 * incremental variable
	 */
	private volatile int counter;

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
