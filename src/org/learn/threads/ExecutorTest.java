package org.learn.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public class ExecutorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] threadname = new  String[4];
		threadname[0] = "A";
		threadname[1] = "AB";
		threadname[2] = "ABC";
		threadname[3] = "ABCD";
		RunnableThread [] run = new RunnableThread[4];
		int i = 0;
		for(String name:threadname){
			run[i] = new RunnableThread(name ,name + "---" + i); 
			i++;
		}
		ExecutorService service = Executors.newCachedThreadPool();
		//Executors.newFixedThreadPool(nThreads);
		
		Executors.newCachedThreadPool();
		
		Executors.newSingleThreadScheduledExecutor();
		
		for(RunnableThread runthread:run){
			service.execute(runthread);
		}
		service.shutdown();
	}

}
