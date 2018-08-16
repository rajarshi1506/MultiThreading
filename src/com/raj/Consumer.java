package com.raj;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService service = Executors.newCachedThreadPool();
		Counter counter = CounterFactory.getCounter(ThreadSafeModes.LOCK);
		System.out.println("initial counter:::" + counter.getCounter());
		IntStream inputs = IntStream.range(0, 200);
		Consumer consumer = new Consumer();
		/**
		 * thread unsafe
		 */

		inputs.forEach(i -> consumer.runThread(service, counter));

		try {
			service.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		service.shutdown();
		System.out.println("final counter:::" + counter.getCounter());

	}

	private void runThread(ExecutorService service, Counter counter) {
		service.submit(new Runnable() {

			@Override
			public void run() {
				counter.increment();
			}
		});
	}

}
