package com.producerconsumer.waitandnotify;

public class Tester {

	public static void main(String[] args) {
		Item item = new Item();
		ShareObject shareObject = new ShareObject();
		item.setObj(shareObject);
		item.getObj();
	}
}
