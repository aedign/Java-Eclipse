package Sorting;

public class countingSortAlg {
	
	static int [] countingSort(int [] array) { //Big O -> O(n+k)
		
		// finds max value in array. Could be a separate method.
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max)
				max = array[i];
		}
		
		int [] count = new int [max+1]; // max is k
		int [] resultArray = new int [array.length];
		
		for(int i = 0; i < array.length; i++)
			count[array[i]]++; 
		
		for(int i = 1; i < count.length; i++)
			count[i] = count[i] + count[i-1];
		
		for(int i = array.length-1; i >= 0; i--)
			resultArray[--count[array[i]]] = array[i];
		
		for(int i = 0; i < array.length; i++)
			array[i] = resultArray[i];
		
		return array;
	}
	
	static void printArray(int array[]) { 
        for (int i=0; i<array.length; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println(); 
    } 
	
	public static void main(String [] args) {
		
		int [] array = {1,3,5,7,8,5,6,7,9,0,4,2,1,3,4,6,7,1000,10,1000,0,0,56,76};
		
		printArray(array);
		
		array = countingSort(array);
		
		printArray(array);
	}

}
