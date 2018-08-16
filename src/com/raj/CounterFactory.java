package com.raj;

public class CounterFactory {

	private CounterFactory() {
	};

	public static Counter getCounter(ThreadSafeModes mode) {
		switch (mode) {
		case SYNCHRONIZED:
			return new SynchronizedCounter();
		case UNSAFE:
			return new Counter();
		case LOCK:
			return new LockCounter();
		}
		return null;
	}
}
