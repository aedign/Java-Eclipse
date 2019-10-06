package Arrays;


//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #7

public class MinMaxAvg2 {

	public static void main(String[] args) {
		
		int[][] grades = new int [1][2];
		
		for (int row = 0; row < grades.length; row++) {
			
			for (int column = 0; column < grades[row].length; column++) {
				
				grades[row][column] = (int) (Math.random() * 100 + 1);
				
			}
		
		}
		
		System.out.println("Array grades: ");
		
		for (int count = 0; count < grades.length; count++) {
			
			for (int count2 = 0; count2 < grades[count].length; count2++) {
				
				if (count2 % 4 == 0) {
					System.out.println();
				}
				
				System.out.print(grades[count][count2] + "\t");
			}
		}
		
		System.out.println("\n");
		minMaxAvg(grades);


	}
	
	static void minMaxAvg (int[][] array) {
		
		int max = 0;
		int min = 100;
		int average = 0;
		
		for (int row = 0; row < array.length; row++) {
			
			for (int column = 0; column < array[row].length; column++) {
				
				if (array[row][column] > max) {
					max = array[row][column];
				}
			}
			
		}
		
		for (int row = 0; row < array.length; row++) {
			
			for (int column = 0; column < array[row].length; column++) {
				
				if (array[row][column] < min) {
					min = array[row][column];
				}
			}
			
		}
		
		for (int row = 0; row < array.length; row++) {
			
			for (int column = 0; column < array[row].length; column++) {
				
				average = average + array[row][column];
				
			}
		}
		
		System.out.println("Highest grade: " + max + "\n" + "Lowest grade: " + min + "\n" + "Average grade: " + (average/(array.length * array[0].length)));
	
	}

}
