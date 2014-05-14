package com.producerconsumer.waitandnotify;

public class Producer implements Runnable{
	Item item;
	ShareObject obj;
	public Producer(Item item) {
		super();
		this.item = item;
	
	}

	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
		
		
		
		synchronized (item) {
			if (item.obj != null){
			try {
				item.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			System.out.println("make object by producer");
			obj = new ShareObject();
			item.setObj(obj);
			item.notify();
		}
		
		
		}
	}

}
