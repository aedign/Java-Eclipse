package Sorting;

public class radixSortAlg {
	
static int [] radixSort(int [] array) { //Big O -> O(n+k)
		
		// finds max value in array. Could be a separate method.
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max)
				max = array[i];
		}
		
		for(int pos = 1; max/pos > 0; pos = pos * 10)
			countingSort(array, pos);
		
		return array;
	}
	
	private static void countingSort(int[] array, int pos) {	
		
		int [] count = new int [10];
		
		int [] resultArray = new int [array.length];
		
		for(int i = 0; i < array.length; i++)
			count[(array[i]/pos)%10]++; 
		
		for(int i = 1; i < count.length; i++)
			count[i] = count[i] + count[i-1];
		
		for(int i = array.length-1; i >= 0; i--)
			resultArray[--count[(array[i]/pos)%10]] = array[i];
		
		for(int i = 0; i < array.length; i++)
			array[i] = resultArray[i];
		
	}

	static void printArray(int array[]) { 
        for (int i=0; i<array.length; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println(); 
    } 
	
	public static void main(String [] args) {
		
		int [] array = {4, 1000, 44, 500, 3};
		
		printArray(array);
		
		array = radixSort(array);
		
		printArray(array);
	}


}
