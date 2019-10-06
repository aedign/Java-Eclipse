package Arrays;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #7




import java.util.Scanner;

public class Ocurrences {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int[] array1 = new int [10];
		
		System.out.println("Please enter positive integers:");
		
		for (int count = 0; count < array1.length; count++) {
		
		array1[count] = scan.nextInt();
	
		}
		
		System.out.print("Entered integers: ");
				
		for (int count = 0; count < array1.length; count++) {
			
			System.out.print(array1[count]);
			if (count < array1.length-1) {
				System.out.print(", ");
			}
			
			
			}
		
		System.out.println();
		
		Count(array1);
		scan.close();
		 
	}
		
		static void Count(int[] array) {
			
			
			
			for (int count = 0; count < array.length; count++) {
				
				int number = array[count];
				int ocurrence = 0;
				 
				for (int count2 = 0; count2 < array.length; count2++) {
					if (array[count2] == number) {
						ocurrence++;
						array[count2] = -1;
					}		
				}
				
				
				if (number != -1) {
					if (ocurrence == 1) {
						System.out.println(number + " ocurred " + ocurrence + " time");
					}
					else {
						System.out.println(number + " ocurred " + ocurrence + " times");
					}
				}
	}
}
}
