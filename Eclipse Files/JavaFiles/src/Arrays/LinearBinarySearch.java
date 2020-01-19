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
		
		System.out.println("Linear Search Comparisons: " + linearSearch(array, target));
		System.out.println("Binary Search Comparisons: " + BinarySearch(array, target));
		scan.close();
	}
	
	public static int linearSearch (int [] array, int target) { //Big O -> O(n)
		
		for (int index = 0; index < array.length; index++) { // loops through array to find the key
			
			if (array[index] == target) {
				
				return index; // the index where the target value was is returned
					
			}
		}
		return -1; // if the target was not found, it returns -1

	}
	
	
	public static int BinarySearch (int [] array, int target) { // Big O -> O(log(n))
		
		int BinarySearch = 0; // variable that returns number of comparisons
		int low = 0; // beginning of part of array to be used
		int high = array.length; // end of part of array to be used
		int mid = 0; // middle of the part of the array used and where the target would be found
		
		for (int count = 0; count < array.length; count++) {
		
			mid = (low+high)/2; // the middle of the array is calculated inside the loop 
								// since it will change as the low and high change too.
			
			if (target == array[mid])
				return BinarySearch = count + 1; // target was found and returns the amount of comparisons made
			
			else if (target < array[mid]) // the target is less than the value at the middle
				high = mid; // so the new high is at the middle
			
			else // the target is bigger than the value of the array at the middle,
				low = mid; // so the new low is at the middle
			
			if (low >= high -1)     //if the low is equal or bigger than the high, 
				return BinarySearch;//the array has been completely search through and the
									//method should return 0
	}
		return BinarySearch;
	}

	
}


