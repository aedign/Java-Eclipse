//Andres Di Gregorio
package DataStructures;

import java.util.Scanner;

public class ArrayList<T> {
	
	private final int DEFAULT_CAPACITY = 10;
	private T[] array;
	private int size;
	public int used;
	private int currentIndex;
	
	@SuppressWarnings("unchecked")
	public ArrayList(){
		
		this.array = (T[]) new Object [DEFAULT_CAPACITY];
		this.size = DEFAULT_CAPACITY;
		this.currentIndex = 0;	
		this.used = 0;
	}
	
	@SuppressWarnings("unchecked")
	private void resize() {
		T[] newArray = (T[]) new Object [size*2];
		
		for(int i = 0; i < size-1; i++) {
			newArray[i] = array[i];
			currentIndex = i;
		}

		currentIndex++;
		used = currentIndex;
		array = newArray;
		size = size * 2;
	}
	
	public void add(T value) {
		if(currentIndex == size) {
			resize();
		}
		array[currentIndex++] = value;
		used++;
	}
	
	public void remove(T value) {
		for(int i = 0; i < size-1; i++) {
			if(array[i] == value) {
				array[i] = null;
				return;
			}
		}
	}
	
	public String toString() {
		String result = "[";
		for(T item : array) {
			if(item != null) {
			result += item + ", ";
			}
		}
		return result + "]";
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(3);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
	}
	
	
	
}