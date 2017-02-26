package com.github.ljt19960125.coding2017.basic;

public class Stack {
	private ArrayList element = new ArrayList();
	public int size(){
		return element.size();
	}
	public void push(Object o){
		element.add(o);
	}
	public Object pop(){
		Object o = null;
		if(element.size()>0){
			o = element.get(element.size()-1);
			element.remove(element.size()-1);
		}
		return o;
	}
	public boolean isEmpty(){
		return element.size()==0;
	}
	public Object peek(){
		return element.get(0);
	}
}
