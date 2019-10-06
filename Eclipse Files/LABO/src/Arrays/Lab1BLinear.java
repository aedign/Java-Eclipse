package Arrays;

// Andres Di Gregorio

import java.util.Random;


public class Lab1BLinear {
	public static void main(String[] args) {
		
		
	
int [] nums = {1, 4, 4, 22, -5, 10, 21, -47, 23};
int key = 22;

int [] data = new int [20];

AssignValues(data);



System.out.println("Key value: " + key);
System.out.println("Key value found in index: " + linearSearch(nums,key));

System.out.println("Key value: " + key);

if (linearSearch(data,key) == -1) {
	
System.out.println("Key value found in index: Value not found in the array");

}

else {
	
	System.out.println("Key value found in index: " + linearSearch(data,key));
	
}

System.out.print("Array:");
for (int count = 0; count < data.length; count++) {
	
	System.out.print(data[count] + " ");
}



	}
	
public static int linearSearch (int [] nums, int key) {
	
	int index = -1;
	
	for (int count = 0; count < nums.length; count++) {
		
		if (nums[count] == key) {
			
			return count;
				
		}
		
		
	}
	return index;

}
	

public static void AssignValues (int [] data) {
	
	Random rand = new Random();
	
	for (int count = 0; count < data.length; count++) {
		
		data[count] = rand.nextInt(200) + -100;
		
		
	}
	

	
	
	
	
}




}
