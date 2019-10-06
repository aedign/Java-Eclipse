package Arrays;


import java.util.Scanner;

public class TEST {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int [][] array = new int [3][3];
		
		int [][] array2 = new int [3][3];
		
		System.out.println("Enter 9 numbers for Array 1: ");
		
		for (int r = 0; r < array.length; r++ ) {
			
			for (int c = 0; c < array.length; c++) {
			
			array[r][c] = scan.nextInt();
			
			}
		}
		
		System.out.println("Enter 9 numbers for Array 2: ");
		
		for (int r = 0; r < array2.length; r++ ) {
			
			for (int c = 0; c < array2.length; c++) {
			
			array2[r][c] = scan.nextInt();
			
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
		
		
		
		
		System.out.println("Array 1 (sorted): \n");

		for (int r = 0;r < array.length; r++){
	
			for (int c = 0; c < array[r].length; c++ ) {
		
				System.out.print(BubbleSort(array)[r][c] + " ");
				if (c == 2) {
					System.out.println();
				}
			}
		}
		System.out.println("\n");
		System.out.println("Array 2 (sorted): \n");

		for (int r = 0;r < array2.length; r++){
	
			for (int c = 0; c < array2[r].length; c++ ) {
		
				System.out.print(BubbleSort(array2)[r][c] + " ");
				if (c == 2) {
					System.out.println();
				}
			}
		}
		System.out.println("\n");
		System.out.println("Judgemnt: ");
		if (isEquivalent(BubbleSort(array), BubbleSort(array2))	== false) {
			System.out.print("The arrays are not equivalent");
		}
		else {
			System.out.print("The arrays are equivalent");
		}
		scan.close();
}
	
	

	
	public static int[][] BubbleSort(int [][] array) {
		
		int temp = 0;
		
		
		
		for (int count = 0; count < array.length; count++) {
			int count3 = 0;
			for (int count2 = 1; count2 < array.length; count2++) {
		
			if (array[count][count3] > array[count][count2]) {
				
				temp = array[count][count2];
				
				array[count][count2] = array[count][count3];
				array[count][count3] = temp;
		count3++;
			
			}
			
			}

		}
		
		return array;
		
		
		}
	
	
	public static boolean isEquivalent(int [][] array, int [][] array2){
		
		boolean isEquivalent = true;
		
		for (int r = 0;r < array.length; r++){
			
			for (int c = 0; c < array[r].length; c++ ) {
				
				if (array[r][c] != array2[r][c]) {
					
					return isEquivalent = false;
				}
				
			}
		
		}
		return isEquivalent;
	}
	
	
	
}



