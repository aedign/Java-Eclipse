
public class MultiThreadingClass {
	
	
	public static int total = 0;

	
	public void run(int [] arrayName, int start, int stop, int num) {
		
		try {
			
			for (int count = start; count < stop; count++) { 
				
				total += arrayName[count];


			}
			
			System.out.println(num + " is running");
			
		}
		
		catch (Exception e) {
			
			System.out.println("Exception caught");
		}
		
	}
	
	public void Add() {
		
		
		
	}
	
	public void setValues() {
		
		
	}

}
