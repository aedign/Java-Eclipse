package Arrays;

public class LinearSearchAlg {
	
	
	public static int linearSearch (int [] array, int target) { //Big O -> O(n)
				
		for (int index = 0; index < array.length; index++) { // loops through array to find the key
			
			if (array[index] == target) {
				
				return index; // the index where the target value was is returned
					
			}
		}
		return -1; // if the target was not found, it returns -1

	}
	
	public static void main(String[] args) {
		
		int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(linearSearch(array, 5));
		
	}

}
