package com.github.ljt19960125.coding2017.basic;

public class ArrayList implements List {
	private int size = 0;
	
	private Object [] elementData = new Object[100];
	@Override
	public void add(Object o) {
		if(size<elementData.length-1){
			elementData[size] =  o;
			size++;
		}else{
			elementData = grow(elementData,elementData.length/2);
			
		}
	}

	private Object[] grow(Object[] src, int addLength) {
		Object [] target = new Object[src.length+addLength];
		System.arraycopy(src, 0, target, 0, src.length);
		return target;
	}

	@Override
	public void add(int index, Object o) {
		if(size<elementData.length-1 && index <elementData.length-1){
			elementData[index] = o ; 
			size ++;
		}else{
			elementData =  grow(elementData,elementData.length/2);
			elementData[index] = o;
			size ++;
		}
	}

	@Override
	public Object get(int index) {
		
		if(index<0){
			return null;
		}
		if(elementData[index]==null){
			return null;
		}else{
			return elementData[index];
		}
	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object remove(int index) {
		
		Object target ;
		if(index < 0){
			return null;
		}
		if(size<index){
			return null;
		}else{
			 target = elementData[index];
			 if(size<elementData.length-1){
			for(int i = index ; i<=size;i++){
				elementData[i] = elementData[i+1] ;
			}
			 }else{
				 elementData =  grow(elementData,elementData.length/2);
				 for(int i = index ; i<=size;i++){
						elementData[i] = elementData[i+1] ;
					}
			 }
		}
	
		return target;
	}
	
}
