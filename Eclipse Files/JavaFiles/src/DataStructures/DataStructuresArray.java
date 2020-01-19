
//  Assignment 4
//  CS3305
//  Created by Andres Di Gregorio on 11/18/19.

package DataStructures;

import java.util.*;

public class DataStructuresArray {
	
	private int addAtIndex;
	private int[] array;
	private int count;
	
	
	DataStructuresArray() {
		
	array = new int[30];
	addAtIndex =0;
	count = 0;
		
	}
	
	private void add(int num) { // Big O -> O(1)
		
		if(addAtIndex==0) {
		array[addAtIndex] = num;
		addAtIndex++;
		count++;
		return;
		}
		array[addAtIndex] = num;
		addAtIndex++;
		count++;
	}
	
	private void remove(int target) { // Big O -> O(n)
		
		for(int i = 0; i < array.length; i++)
			if(array[i] == target) {
				array[i] = 0;
				addAtIndex--;
				count--;
			}
	}
	
	private void search(int target) { // Big O -> O(n)
		
		for(int i = 0; i < array.length; i++)
			if(array[i] == target) {
				System.out.println("The target was found at index: " + i);
				return;
			}
		System.out.println("The target was not found");	
	}	
	
	private void insert(int numberToInsert, int indexToInsert) { // Big O -> O(1)
		
		array[indexToInsert] = numberToInsert;
	}
	
	public static void main(String[] args) {
		
		DataStructuresArray test1 = new DataStructuresArray();

		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		test1.search(3);
		test1.insert(99,0);
		test1.search(99);
		test1.remove(99);
		test1.search(99);
	}
	
}


