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
	
	public static int SelectionSort(int [] array) {
		
		int counter = 0;
		
		for (int count = 0; count < array.length - 1; count++) {
			
			int min = count;
			
			for (int count2 = count + 1; count2 < array.length; count2++) {
				
				if (array[count2] < array[count]) {
					
					min = count2;
				}
			}
	
			
				if (count != min && min < array.length ) {
					int temp = array[min];
					array[min] = array[count];
					array[count] = temp;
					counter++;
				}
			
			}
		
		return counter;
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
