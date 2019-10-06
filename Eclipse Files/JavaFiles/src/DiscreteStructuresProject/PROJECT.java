package DiscreteStructuresProject;

//Andres Di Gregorio

import java.util.Scanner;

public class PROJECT {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length of the arrays");
		int arraylength = scan.nextInt();
		
		
		long totalBubbletime = 0;
		long totalSorttime = 0;
		
		for (int count = 0; count < 1000; count++) {
			
			int [] aa = new int [arraylength];
			RandomNumber(aa);
			
			int [] bb = copyArray(aa);
			
			
			long starttime = System.currentTimeMillis();
			BubbleSort(aa);
			long endtime = System.currentTimeMillis();
			totalBubbletime += endtime - starttime;
			
			
			long starttime2 = System.currentTimeMillis();
			SelectionSort(bb);	
			long endtime2 = System.currentTimeMillis();
			totalSorttime += endtime2 - starttime2;

			
		}

		
		System.out.println("Bubble Sort: " + totalBubbletime);
		System.out.println("Selection Sort: " + totalSorttime);
		
		

	}
	
	public static int [] copyArray(int [] array) {
		
		int [] newArray = new int [array.length];
		
		for (int count = 0;count < newArray.length; count++) {
			
			newArray[count] = array[count];
		}
		
		return newArray;
	}
	
	public static void RandomNumber(int [] array) {
		
		
		for (int count = 0; count < array.length; count++) {
			
			if (array.length < 500) {
				
				array[count] = (int) (Math.random() * 1000 + 1);
			}
			else if (array.length >= 500 && array.length < 1000) {
				
				array[count] = (int) (Math.random() * 5000 + 1);
			}
			else if (array.length >= 1000 && array.length < 2000) {
				
				array[count] = (int) (Math.random() * 25000 + 1);
			}
			else if (array.length >= 2000 && array.length <= 20000) {
				
				array[count] = (int) (Math.random() * 50000 + 1);
			}
		}
		
		
	}
	
	public static void PrintArray(int [] array) {
		
		for (int count = 0; count < array.length; count++) {
			
			System.out.print(array[count] + " ");
		}
		
	}
	
	public static int [] BubbleSort(int [] array) {
		
		int temp = 0;
		
		int [] copyArray = new int[array.length];
		copyArray = array;
	//	int counter = 0;
		
		for (int count = 0; count < copyArray.length; count++) {
			
			for (int count2 = count + 1; count2 < copyArray.length; count2++) {
		
				if (copyArray[count2] < copyArray[count]) {
				
					temp = copyArray[count2];
				
					copyArray[count2] = copyArray[count];
					copyArray[count] = temp;
			//		counter++;
				
				}
			
			}

		}
	//	System.out.println("Bubble: " + counter);
		
		return copyArray;
		
	}
		
	public static int [] SelectionSort(int [] array) {
			
			int [] copyArray = array;
		//	int counter = 0;
			
			for (int count = 0; count < copyArray.length; count++) {
				
				int min = count;
				
				for (int count2 = count + 1; count2 < copyArray.length; count2++) {
					
					if (copyArray[count2] < copyArray[min]) {
						
						min = count2;
					}
				}
		
				
					if (count != min && min < copyArray.length ) {
						int temp = copyArray[min];
						copyArray[min] = copyArray[count];
						copyArray[count] = temp;
			//		counter++;
					}
					
				
				}
		//	System.out.println("Sort: " + counter);
			return copyArray;
			
		}
	
	

}
