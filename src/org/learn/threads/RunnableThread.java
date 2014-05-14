package org.learn.threads;

public class RunnableThread  implements Runnable{

	String threadId;
	String threadName;
	
	public RunnableThread(String threadId, String threadName) {
		super();
		this.threadId = threadId;
		this.threadName = threadName;
	}

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name >>  " + threadName + "  ID  >> " + threadId);
	}

}
