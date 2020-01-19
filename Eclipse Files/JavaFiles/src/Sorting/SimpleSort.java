package Sorting;

 //1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #14

import java.util.Scanner;

public class SimpleSort {
	
	public static int BubbleSort(int [] array) {
	
	int temp = 0;
	
	int counter = 0;
	
	for (int count = 0; count < array.length; count++) {
		
		for (int count2 = count + 1; count2 < array.length; count2++) {
	
		if (array[count2] < array[count]) {
			
			temp = array[count2];
			
			array[count2] = array[count];
			array[count] = temp;
			counter++;
			
		}
		
		}

	}
	
	return counter;
	
	
	}
	
	public static int SelectionSort(int [] array) { // Big O -> O(n^2)
		
		int counter = 0; // keeps track of number of swaps
		
		for (int count = 0; count < array.length - 1; count++) {
			
			// selects a value from the array and its used as the minimum
			int min = count; // variable that keeps track of the 
						     // index where the min value is located
			
			for (int count2 = count + 1; count2 < array.length; count2++)
				if (array[count2] < array[count]) // the inside loop checks the rest of the array to find the smallest item
					min = count2;				  // every time a smaller item is found, the min is now equal to the index of that item
	
				if (count != min && min < array.length ) { // checks that there is a new min and that it is 
					int temp = array[min];				// within the bounds of the array
					array[min] = array[count];			// If the previous conditions are met, the value at index min
					array[count] = temp;				// is swapped and placed in a new sorted location
					counter++;								
				}
			
			}
		
		return counter; // numbers of swaps done is returned
	}
	
	public static int InsertionSort (int [] array) {
		
		int counter=0;
		
		for (int count = 1; count < array.length; count++) {
			
			int key = array[count];
			int position = count;
			
			while (position > 0 && key < array[position-1]) {
				
				array[position] = array[position-1];
				position--;
				counter++;
			}
			
			array[position] = key;
		
			
			
		}

		return counter;
	}
	


	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
	
		int [] array1 = new int [100];
		
		

		
		for (int count = 0; count < array1.length; count++ ) {
			
			array1[count] = (int) (Math.random() * 100 + 0);
			
		}
		int [] array2 = array1.clone();
		
		int [] array3 = array1.clone();
		
		System.out.print("Array's values: ");
		
		for (int count = 0; count < array1.length; count++ ) {
			
			System.out.print(array1[count]);
			if (count != array1.length -1) {
			System.out.print(  ", ");
			}
			
		}
		
		System.out.println("\n");

		System.out.print("Bubble Sorted Swaps: " + BubbleSort(array1));

		
		System.out.println();
		System.out.println("Selection Sort Swaps: " + SelectionSort(array2));
		
		System.out.println();
		System.out.println("Insertion Sort Swaps: " + InsertionSort(array3));
		scan.close();
	}
	


	
}
