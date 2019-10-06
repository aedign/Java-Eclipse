package Sorting;

// Andres Di Gregorio
public class BubbleSortComparison extends Thread implements Runnable{

	public static void main(String[] args) {
	
		
		int [] array = new int [10000];
		RandomNumber(array);
		
		int [] array2 = copyArray(array);
		
		
		long totalBubbletime = 0;
		
		long starttime = System.currentTimeMillis();
		BubbleSort(array);
		long endtime = System.currentTimeMillis();
		totalBubbletime += endtime - starttime;
		
		System.out.println("Traditional Bubble Sort: " + totalBubbletime + " miliseconds\n");
		
		BubbleSortThread b1 = new BubbleSortThread();
		BubbleSortThread b2 = new BubbleSortThread();
		BubbleSortThread b3 = new BubbleSortThread();
		BubbleSortThread b4 = new BubbleSortThread();
		BubbleSortThread b5 = new BubbleSortThread();
		BubbleSortThread b6 = new BubbleSortThread();
		BubbleSortThread b7 = new BubbleSortThread();
		BubbleSortThread b8 = new BubbleSortThread();
		BubbleSortThread b9 = new BubbleSortThread();
		BubbleSortThread b10 = new BubbleSortThread();
		
System.out.println("Thread time:");

		b1.run(array2, 0, 1000, 1);
		b2.run(array2, 1001, 2000, 2);
		b3.run(array2, 2001, 3000, 3);
		b4.run(array2, 3001, 4000, 4);
		b5.run(array2, 4001, 5000, 5);
		b6.run(array2, 5001, 6000, 6);
		b7.run(array2, 6001, 7000, 7);
		b8.run(array2, 7001, 8000, 8);
		b9.run(array2, 8001, 9000, 9);
		b10.run(array2, 9001, 10000, 10);
	
		
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
			
				
				array[count] = (int) (Math.random() * 1000000 + 1);
			
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

}
