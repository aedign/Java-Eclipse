package Arrays;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #13

public class ArrayMethods {

	public static void main(String[] args) {
		
		int[] array = new int [5];
		
		System.out.print("Original array: ");
		
		int number = (int) (Math.random() * 10 + 1);
		for (int count = 0; count < array.length; count++) {
			
			array[count] = number;
			System.out.print(array[count] + ", ");
			number = (int) (Math.random() * 10 + 1);;
		}
		
		System.out.println();
		System.out.println("Max. value: " + arrayMax(array));
		System.out.println("Min. value: " + arrayMin(array));
		System.out.print("Squared array: ");
		arraySquared(array);
		System.out.println();
		System.out.print("Array reverse: ");
		arrayReverse(array);
		

	}
	
	static int arrayMax(int[] array) {
		
		int max = -1;
		for (int count = 0; count < array.length; count++) {
			if (array[count] > max) {
				max = array[count];
			}
		}
		return max;
	}
	
	static int arrayMin(int[] array) {
		
		int min = 101;
		for (int count = 0; count < array.length; count++) {
			if (array[count] < min) {
				min = array[count];
			}
		}
		return min;
	}
	
	static void arraySquared(int[] array) {
		
		int math;
		
		for (int count = 0; count < array.length; count++) {
			
			math = array[count] * array[count];
			System.out.print(math);
			if (count < array.length -1) {
				System.out.print(", ");
			}
			
		}
		
	}
	
	static void arrayReverse(int[] array) {
		
		for (int count = 4; count >= 0; count--) {
			
			array[count] = array[count] * array[count];
			System.out.print(array[count]);
			if (count > 0) {
				System.out.print(", ");
			}
			
			
		}
		
		
	}
	
	

}
