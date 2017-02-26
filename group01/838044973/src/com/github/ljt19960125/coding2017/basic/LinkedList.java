package com.github.ljt19960125.coding2017.basic;



public class LinkedList implements List {
	private Node head ;
	private int size = 0;
	private Node tail;
	public void add(Object o){
		add(size,o);
	}
	public void add(int index,Object o){
		if(index == 0){
			addFirst(o);
		}else{
			if(index >=size){
				addLast(o);
			}else{
				Node temp = head;
				for(int i=1;i<index;i++){
					temp = temp.next;
				}
				Node nextNode =  temp.next;
				Node target = new Node(o);
				temp.next = target;
				target.next = nextNode;
				size++;
			}
		}
	
		

	}


	public void addLast(Object o) {
		if(size==0){
			head = new Node(o);
			tail = head;
		}else{
			Node node = new Node(o);
			tail.next = node;
			tail = tail.next;
		}
		size++;
	}

	public void addFirst(Object o) {
		Node node = new Node(o);
		node.next = head;
		head = node;
		size++;
		if(size ==1){
			tail = head;
		}
		size++;
	}
	public Object get(int index){
		Node temp = head;
		
		if(index < 0 || index >= size()){
			throw new IndexOutOfBoundsException("索引有误！");
		}else{
			for(int i = 0;i<index;i++){
				temp = temp.next;
			}
		}
		
			
		return temp.data;
	}
	public Object remove(int index){
		if(index == 0){
			Node temp = head;
			head = head.next;
			return temp.data;
		}else{
			if(index>=size){
				throw new IndexOutOfBoundsException("索引有误！");
			}else{
				Node temp = head;
				for(int i=1;i<index;i++){
					temp = temp.next;
				}
				Node target = temp.next;
				target.next = temp.next;
				size--;
				return target.data;
			}
		}
	}
	public int size(){
		return size;
	}

	public Object removeFirst(){
		return remove(0);
	}
	public Object removeLast(){
		return remove(size);
	}
	private static class Node{
		Object data;
		Node next;
		int index ;
		public Node(Object data){
			this.data = data;
		}
	}
}