package Sorting;

// Andres Di Gregorio

import java.util.Random;


public class Lab1BBinary {

	public static void main(String[] args) {
		
		int [] nums =  {-47, -5, 1, 4, 4, 10, 21, 22, 23};
		int number = 1;
		
		int [] data = new int [20];
		
		AssignValues(data);
		SortArray(data);
		
		System.out.println("Array nums's values: ");
		
		for (int count =0; count < nums.length; count++) {
			
			System.out.print(nums[count] + " ");
		}
		
		System.out.println();
		System.out.println("Number " + number + " found in index: " + binarySearch(nums, number));
		System.out.println();
		
		System.out.println("Array data's values: ");
		
		for (int count =0; count < data.length; count++) {
			
			System.out.print(data[count] + " ");
		}
		
		System.out.println();
		System.out.println("Number " + number + " found in index: " + binarySearch(data, number));
		System.out.println();
		
		
		
		
		

	}
	
	
	
	public static int binarySearch (int [] array, int number) {
		
		int low =0;
		int high = array.length;
		int mid = 0;
		boolean found = false;
		
		
		while (found == false) {
			
			mid = (low+high)/2;
			
			if (number == array[mid]) {
		
				
				return mid;
				
			}
			
			else if (number < array[mid]) {
				
				high = mid;
			}
			else {
				
				low = mid;
			}
			
			if (number < array[mid] && number > array[mid-1]) {
				
				mid = (mid + 1) * (-1); 
				return mid;
				
			}
			
			
			if (low> high-1) {
				
				mid = -20;
				
			return mid;
			
			
			}
			

		}
		return mid;
		
		
		
		
		
	}

	public static void AssignValues (int [] data) {
		
		Random rand = new Random();
		
		for (int count = 0; count < data.length; count++) {
			
			data[count] = rand.nextInt(200) + -100;
			
			
		}
		

		
		
		
		
	}
	
	public static void SortArray (int [] array) {
		
		int temp = 0;
		
		
		for (int count = 0; count < array.length; count++) {
			
			
			
			for (int count2 = count +1 ; count2 < array.length; count2++) {
				
				if (array[count2] < array[count]) {
					
					temp = array[count2];
					array[count2] = array[count];
					array[count] = temp;
					
					
				}
				
				
				
			}
			
			
		}
		
		
		
		
	}
}
