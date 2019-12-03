package com.revature.list;

import java.util.Arrays;

public class MyArrayList {

	private int[] arr = new int[10];
	private int size = 0;
	private int capacity = this.arr.length;
	
	public void add(int val) {
		
		if (this.size < this.capacity) {
			this.arr[this.size] = val;
			this.size++;
		} else {
			int oldCap = this.capacity;
			this.capacity *=2;
			int newArr[] = new int[this.capacity];
			for(int i=0; i<oldCap; i++) {
				newArr[i] = this.arr[i];
			}
			newArr[this.size] = val;
			this.arr = newArr;
			this.size++;
		}
	}

	public void set(int index, int val) {
		
		if(index <= this.size) {
			this.arr[index] = val;
		}	
			this.arr[index] = val;
	}

	public void remove(int index) {
		int[] newArr = new int[this.capacity];
		for(int i=0, j=0; i<size; i++, j++) {
			if(i==index) {
				i++;
			}
			newArr[j] = arr[i];
		}
		this.arr = newArr;
		this.size--;
	}

	public int get(int index) {
		return arr[index];
	}

	@Override
	public String toString() {
		int[] newArr = new int[this.size];
		for(int i=0; i<this.size; i++) {
			newArr[i] = this.arr[i];
		}
		return Arrays.toString(newArr);
	}
}
