package Arrays;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #12


public class AddMatrices {

	public static void main(String[] args) {
		
		int [][] array = new int [3][3];
		int [][] array2 = new int [3][3];
		
		for (int r = 0;r < array.length; r++){
			
			for (int c = 0; c < array[r].length; c++ ) {
				
				array[r][c] = (int) (Math.random() * 100 +1);
				
			}
			
		}
		
		for (int r = 0;r < array2.length; r++){
			
			for (int c = 0; c < array2[r].length; c++ ) {
				
				array2[r][c] = (int) (Math.random() * 100 +1);
				
			}
			
		}
		
		System.out.println("Array 1: \n");

		for (int r = 0;r < array.length; r++){
	
			for (int c = 0; c < array[r].length; c++ ) {
		
				System.out.print(array[r][c] + " ");
				if (c == 2) {
					System.out.println();
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Array 2: \n");
		
		for (int r = 0;r < array2.length; r++){
			
			for (int c = 0; c < array2[r].length; c++ ) {
		
				System.out.print(array2[r][c] + " ");
				if (c == 2) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("Array 3: \n");
		
		for (int r = 0;r < array2.length; r++){
			
			for (int c = 0; c < array2[r].length; c++ ) {
		
				System.out.print((Addition(array, array2)[r][c]) + " ");
				if (c == 2) {
					System.out.println();
				}
			}
		}
		
		
		
	}
	
	
	
public static int[][] Addition(int [][] array, int [][] array2) {
	
	int [][] array3 = new int [3][3];

	for (int r = 0;r < array.length; r++){
		
		for (int c = 0; c < array[1].length; c++ ) {
			
			array3[r][c] = (array[r][c] + array2[r][c]);
			
		}
	
	}
	
	return array3;

}

}
