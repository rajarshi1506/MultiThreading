package com.raj;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockCounter extends Counter {

	/*
	 * incremental variable
	 */
	private int counter;
	private ReadWriteLock lock = new ReentrantReadWriteLock();

	public void increment() {
		lock.writeLock().lock();
		try {
			counter++;
			System.out.println(Thread.currentThread().getName() + " incremented counter to:::" + counter);
		} finally {
			lock.writeLock().unlock();
		}
	}

	public int getCounter() {
		lock.readLock().lock();
		try {
			return counter;
		} finally {
			lock.readLock().unlock();
		}
	}

}
