package Arrays;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #14

import java.util.Scanner;

public class LinearBinarySearch {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int [] array = new int [10];
		
		System.out.println("Enter 10 numbers: ");
		
		for (int count = 0; count < array.length; count++ ) {
			
			array[count] = scan.nextInt();
			
		}
		
		System.out.println("Enter a target value: ");
		int target = scan.nextInt();
		
		System.out.print("Array's values: ");
		
		for (int count = 0; count < array.length; count++ ) {
			
			System.out.print(array[count]);
			if (count != 9) {
			System.out.print(  ", ");
			}
			
		}
		
		System.out.println();
		System.out.println("Target value: " + target);
		
		System.out.println("Linear Search Comparisons: " + LinearSearch(array, target));
		System.out.println("Binary Search Comparisons: " + BinarySearch(array, target));
		scan.close();
	}
	
	public static int LinearSearch (int[] array, int target) {
		
		int linearSearch = 0;
		
		for (int count = 0; count < array.length; count++) {
			
			int temp = array[count];
			
			if (temp == target) {
				
				return linearSearch = count + 1;
			}	
		}
		
		return linearSearch;
	}
	
	
	public static int BinarySearch (int [] array, int target) {
		
		int BinarySearch = 0;
		
		int low = 0;
		
		int high = array.length;
		
		int mid = 0;
		
		
		for (int count = 0; count < array.length; count++) {
			
			mid = (low+high)/2;
			
			if (target == array[mid]) {
				
				return BinarySearch = count + 1;
			}
			
			else if (target < array[mid]) {
				
				high = mid;
			}
			
			else {
				
				low = mid;
			}
			
			if (low >= high -1) {
				return BinarySearch;
			}
		
	}
		
		return BinarySearch;
	
	}

	
}


