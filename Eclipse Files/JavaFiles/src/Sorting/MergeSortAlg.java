package Sorting;

public class MergeSortAlg {
	
	public static int [] mergeSort(int [] array) { // Big O -> O(n log(n))
		
		if(array.length <= 1) // if array only has 1 item, it is already sorted
			return array;
		
		int mid = array.length/2; // middle of array
		int [] left = new int [mid]; // array to store values on left of the array
		int [] right; // array to store values on right of the array
		
		if(array.length % 2 == 0) // if the array's length is an even number
			right = new int[mid]; // then the right array has the same length as the left
		else
			right = new int[mid + 1]; // otherwise, it is bigger by 1
		
		for(int i = 0; i < mid; i++) // assigning values to left array
			left[i] = array[i];
		
		for(int i = 0; i < right.length; i++) // assigning values to right array
			right[i] = array[mid+i];
		
		int [] result = new int[array.length]; // array with result to be returned
		
		left = mergeSort(left); // recursive call to keep dividing left array
		right = mergeSort(right); // recursive call to keep dividing right array
		
		int leftPointer = 0; // index of item to be added in the left array
		int rightPointer = 0; // index of item to be be added in the right array
		int resultPointer = 0; // index of item to be added in the result array
		
		//while there are items to be added
		while(leftPointer < left.length || rightPointer < right.length) 
			//if there are items in both arrays
			if(leftPointer < left.length && rightPointer < right.length)
				if(left[leftPointer] < right[rightPointer]) // adds from left array if item is smaller
					result[resultPointer++] = left[leftPointer++];
				else //otherwise, add from right array
					result[resultPointer++] = right[rightPointer++];
			//if there are items left just in the left array
			else if(leftPointer < left.length)
				result[resultPointer++] = left[leftPointer++];
			//if there are items left just in the right array
			else
				result[resultPointer++] = right[rightPointer++];
		
		return result; //sorted array returned
	}
	
	public static void printArray(int [] array) {
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int [] array = new int[] {3,1,6,9};
		printArray(array);
		
		
		int [] array2 = mergeSort(array);
		printArray(array2);

	}

}
