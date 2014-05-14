package com.producerconsumer.waitandnotify;

public class ProducerConsumerTest {
	
	public static void main(String[] args) {
		Item item = new Item();
		Producer producer = new Producer(item);
		
		Thread producerThread = new Thread(producer);
		producerThread.start();
		
		Consumer consumer = new Consumer(item);
		Thread consumerThread = new Thread(consumer);
		consumerThread.start();
	}
	
	
}
