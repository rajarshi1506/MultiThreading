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
		case VOLATILE:
			return new VolatileCounter();
		case SYNCHRONIZED_VOLATILE:
			return new SynchronizedVolatileCounter();
		case ATOMIC:
			return new AtomicCounter();
		}
		return null;
	}
}
