package Arrays;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #13




import java.util.Scanner;

public class CompareArrays {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		
		System.out.println("Enter the length of the arrays: ");
		
		int a = scan.nextInt();

		int[] array = new int[a];

		int[] array2 = new int[a];
		
		
		
		System.out.println("Enter the values of the first array: ");
		
		for (int count = 0; count < array.length; count++) {
			
			array[count] = scan.nextInt();
		
		}
		
		
		
System.out.println("Enter the values of the second array: ");
		
	for (int count = 0; count < array2.length; count++) {
	
		array2[count] = scan.nextInt();

	}
		
		System.out.println("Array size: " + a);
		System.out.print("First array: ");
		
			for (int count = 0; count < array.length; count++) {
			
			System.out.print(array[count] + ", ");
		}
			
			System.out.println();
		
		System.out.print("Second array: ");
		
			for (int count = 0; count < array2.length; count++) {
			
			System.out.print(array2[count] + ", ");
		
		}
			
			System.out.println();
			
			
			if (Compare(array, array2) == true) {
				
				System.out.println("Judgment: The arrays are identical");
			}
			else {
				System.out.println("Judgment: The arrays are not identical");
			}
			
		
			scan.close();
		
	
	}

	static boolean Compare (int[] array, int[] array2){
		
		
		
		for (int count = 0; count < array.length; count++) {
			
			if (array[count] == array2[count]) {
			}
			else {
				return false;
			}
			
		}	
		return true;
	}
	
	
	
	
}
	
	
