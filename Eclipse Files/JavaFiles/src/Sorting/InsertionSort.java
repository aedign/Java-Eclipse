package Sorting;


public class InsertionSort {

	public static void main(String[] args) {
		
		int [] array2 = new int[] {1,7,2,3,33,8,9,0,12,44};
		
		for (int count = 0; count < array2.length; count++ ) {
			
			System.out.println(insertionSort(array2)[count]);
			
		}
	}
	
	public static int [] insertionSort (int [] array) { // Big O -> O(n^2)
		
		for (int count = 1; count < array.length; count++) {
			
			int temp = array[count]; // stores value to be compared
			int index = count; // index of the temp value in the array
			
			while (index > 0 && temp < array[index-1]) { // if index is greater than zero and a
				array[index] = array[index-1];			 //value located before the temp is 
				index--;								 //less than the value of temp, then values are swapped
			}
			array[index] = temp;
		}
		return array;
	}

}
