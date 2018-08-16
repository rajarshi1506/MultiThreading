package com.raj;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter extends Counter {
	/*
	 * incremental variable
	 */
	private AtomicInteger counter = new AtomicInteger(0);

	public void increment() {
		counter.incrementAndGet();
		System.out.println(Thread.currentThread().getName() + " incremented counter to:::" + counter);
	}

	public int getCounter() {
		return counter.get();
	}
}
