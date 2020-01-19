package Sorting;

public class quickSortAlg {
	
    static void printArray(int array[]) { 
        for (int i=0; i<array.length; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println(); 
    } 
	
	static int[] quickSort(int array[], int low, int high) { // Big 0 -> O(n^2)
	    
        if (low < high) { // there are values to check
        
        	int pivot = array[high]; // the pivot used is the last element
            int lastSwapIndex = (low-1); // index of bigger element (or equal)
            for (int i = low; i < high; i++) {
                if (array[i] <= pivot) { // if current value is smaller than the pivot
                	lastSwapIndex++; 
                    // swap current value with the bigger value 
                    int temp = array[lastSwapIndex]; 
                    array[lastSwapIndex] = array[i]; 
                    array[i] = temp; 
                } 
            }
            // all values have been checked, so the pivot has to change its location
            // The code below changes the location of the pivot. It now has smaller (or equal) 
            // values to the left and bigger values to the right
            int temp = array[lastSwapIndex+1]; 
            array[lastSwapIndex+1] = array[high]; 
            array[high] = temp; 
            lastSwapIndex++; // this variable is now equal to the pivot
  
            // Recursively sort elements before 
            // partition and after partition 
            
         // recursive call with high equal to the pivot.Sorts the left of the array,
         // which has values smaller than the pivot
            quickSort(array, low, lastSwapIndex-1); 
           
         // recursive call with low equal to element next to the pivot. Sorts the right 
         // of the array, which has values bigger than the pivot
            quickSort(array, lastSwapIndex+1, high); 
        }
        return array; // returns sorted array
    }

    public static void main(String args[]) { 
        int array[] = {4,6,2,0,7,1,9,8,3,5,1,1,1,3,4,6,9,4,2,34}; 
        printArray(array); 
        
        array = quickSort(array, 0, array.length-1); 
  

        printArray(array); 
    } 

	
}
