package Arrays;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #7

import java.util.Scanner;


public class DistinctValues {

	public static void main(String[] args) {
		
	 Scanner scan = new Scanner (System.in);
	 
	 System.out.println("Enter 10 integers: ");
		
		int[] array1 = new int [10];
		
		for (int count = 0; count < array1.length; count++) {
			
			array1[count] = scan.nextInt();
			
		}
		
		System.out.print("Original array: ");
		
		for (int count = 0; count < array1.length; count++) {
			
			System.out.print(array1[count] + " ");

			}
		
		System.out.println();
		
		System.out.print("Distinct array: ");
		
		for (int count = 0; count < getValues(array1).length; count++) {
	
			if (getValues(array1)[count] != -999999999) {
			
				System.out.print(getValues(array1)[count] + " ");
			}
			
			
		}
		
		
		System.out.println();
		
		scan.close();

	}
	
	static int[] getValues (int[] array) {
		
		for (int count = 0; count < array.length; count++) {
			
			int number = array[count];
			
			for (int count2 = count + 1; count2 < array.length; count2++) {
				
				if (array[count2] == number) {
					array[count2] = -999999999;
				}
		}
		
		
		}
		return array;
		
	}
	
}
