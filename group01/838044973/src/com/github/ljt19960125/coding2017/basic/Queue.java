package com.github.ljt19960125.coding2017.basic;

public class Queue {
	private LinkedList list = new LinkedList();
	
	private int size = 0;
	
	public void enQueue(Object o){
		size++;
		list.addLast(o);
	}
	public Object deQueue(){
		size--;
		return list.removeFirst();
	}
	public boolean isEmpty(){
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}
	public int size(){
		return size;
	}
	
}

