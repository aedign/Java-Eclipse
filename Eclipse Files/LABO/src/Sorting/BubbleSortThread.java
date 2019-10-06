package Sorting;


public class BubbleSortThread{
	
	static long time = 0;
	
public void run(int [] array, int start, int stop, int num) {
		
		try {
				
			int temp = 0;
			
			long starttime = System.currentTimeMillis();
			
			for (int count = start; count < stop; count++) { 
				
				for (int count2 = count + 1; count2 < array.length; count2++) {
					
					if (array[count2] < array[count]) {
					
						temp = array[count2];
					
						array[count2] = array[count];
						array[count] = temp;
					
					}
				
				}


			}
			
			long endtime = System.currentTimeMillis();
			
			time += endtime -  starttime;
			
			System.out.println(num + " is running\n Time: " + time + " miliseconds");
			
		}
		
		catch (Exception e) {
			
			System.out.println("Exception caught");
		}
		
	}



}
