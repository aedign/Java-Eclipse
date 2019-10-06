package Arrays;

// Andres Di Gregorio


import java.util.Random;

public class Array1d {

public static void main(String[] args) {
	
		
int [] nums = {1,4,13,43,-25,17,22,-37,29};

int [] data = new int [20];
		
findLargest(nums);

Values(data);

findLargest(data);

System.out.println("Data's values:\n ");

for (int count = 0; count < data.length; count++) {
	
	System.out.print(data[count] + ", ");

}

System.out.println();
length(data);



	}


public static void findLargest (int [] nums) {
	
int max = 0;

for (int count = 0; count < nums.length; count++) {
	
	if (nums[count] > max) {
		
		max = nums[count];
	}
}

System.out.println("The highest value is: " + max);
	
	
	
	

}



public static void Values (int [] array) {


	
	Random rand = new Random();
	
	for (int count = 0; count < array.length; count++) {
		
		array[count] = rand.nextInt(200) + -100;
	
	}
	

}




public static void length(int [] array) {
	
	int counter = 0;
	int counter2 = 0;
	
	for (int count = 0; count < array.length; count++) {
		
		if (array[count] >= 0) {
			
			counter++;
			
		}
		else if (array[count] == 0 ) {
			 
			 counter--;
		 }
		else {
			
			if (counter > counter2) {
				
				counter2 = counter;
				
				
			}
			counter = 0;
			
		}
		
		
	}
	
	System.out.println("Longest consecutive positive sequence: " + counter2);
	
	
	
	
}





}