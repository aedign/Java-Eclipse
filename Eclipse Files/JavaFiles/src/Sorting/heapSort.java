package Sorting;

public class heapSort {
	
	public static void heapify(int [] array, int n, int rootIndex) {
		
		int largest = rootIndex;
		int leftChildIndex = (2*rootIndex) + 1;
		int rightChildIndex = (2*rootIndex) + 2;
		
		if(leftChildIndex < n && array[leftChildIndex] > array[largest])
			largest = leftChildIndex;
		
		if(rightChildIndex < n && array[rightChildIndex] > array[largest])
			largest = rightChildIndex;
		
		if(largest != rootIndex) {
			// swap
			int temp = array[rootIndex];
			array[rootIndex] = array[largest];
			array[largest] = temp;
			
			heapify(array, n, largest);
		}	
	}
	
	public static void heapSort(int [] array) {
		
		for(int i = (array.length/2) -1; i >= 0; i--)
			heapify(array, array.length, i);
		
		for(int i = array.length - 1; i >= 0; i--) {
			// swap
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			heapify(array, i, 0);
		}			
	}
	
	static void printArray(int array[]) { 
        for (int i=0; i<array.length; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println(); 
    } 
	
	public static void main(String [] args) {
		
		int [] array = {4, 1000, 44, 500, 3,1,0,0,1,2,3,5,7,8,90,55,4};
		
		printArray(array);
		
		heapSort(array);
		
		printArray(array);
	}

}
