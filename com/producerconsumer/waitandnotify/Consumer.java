package com.producerconsumer.waitandnotify;

public class Consumer implements Runnable{

	Item item;
	
	
	public Consumer(Item item) {
		super();
		this.item = item;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			
			synchronized (item) {
			if(item.obj == null){	
			try {
					item.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			   ShareObject shareobj = item.getObj();
				item.setObj(null);
				System.out.println("Got item obj");
				item.notify();
				}
			}
		
	}

}
