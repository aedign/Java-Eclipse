package Arrays;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #7

import java.util.Scanner;

public class IndexOfLargest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter 10 integers: ");
		
		int[] array1 = new int [10];
		
		for (int count = 0; count < array1.length; count++) {
			
			array1[count] = scan.nextInt();
			
		}
		
		System.out.print("Entered integers: ");
		
		for (int count = 0; count < array1.length; count++) {
			
			System.out.print(array1[count]);
			if (count < array1.length - 1) {
				System.out.print(", ");
			}
			
			
			}
		
		System.out.println();
		
		findIndex(array1);
		scan.close();
	}
	
	
	public static void findIndex (int[] array) {
		
		int maxValue = 0;
		int maxIndex = 0;
		
		for (int count = 0; count < array.length; count++) {
			
			if (array[count] > maxValue) {
				
				maxValue = array[count];
				maxIndex = count;
				
			}
			
		}
		
		System.out.println("Index of largest value: " + maxIndex);
		
	}
	
	

}
