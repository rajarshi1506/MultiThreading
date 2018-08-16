package com.raj;

public class VolatileCounter extends Counter{
	/*
	 * incremental variable
	 */
		private volatile int counter;
		
		public void increment() {
			counter++;
			System.out.println(Thread.currentThread().getName()+" incremented counter to:::"+counter);
		}
		
		public int getCounter() {
			return counter;
		}
}
