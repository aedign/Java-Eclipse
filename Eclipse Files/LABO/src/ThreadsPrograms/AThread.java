package ThreadsPrograms;



public class AThread extends Thread{
	
	

	
	public static void main(String [] args) {
		
		int [] array = new int[100000];

		for (int count = 0; count < 100000; count++) {
			
			
			
			array[count] = (int) (Math.random() * 10 + 1);
			
		
			
		}
		
		MultiThreadingClass x1 = new MultiThreadingClass();
		MultiThreadingClass x2 = new MultiThreadingClass();
		MultiThreadingClass x3 = new MultiThreadingClass();
		MultiThreadingClass x4 = new MultiThreadingClass();
		MultiThreadingClass x5 = new MultiThreadingClass();
		MultiThreadingClass x6 = new MultiThreadingClass();
		MultiThreadingClass x7 = new MultiThreadingClass();
		MultiThreadingClass x8 = new MultiThreadingClass();
		MultiThreadingClass x9 = new MultiThreadingClass();
		MultiThreadingClass x10 = new MultiThreadingClass();
		
		
		x1.run(array, 0, 10000, 1);
		x2.run(array, 10001, 20000,2);
		x3.run(array, 20001, 30000,3);
		x4.run(array, 30001, 40000,4);
		x5.run(array, 40001, 50000,5);
		x6.run(array, 50001, 60000,6);
		x7.run(array, 60001, 70000,7);
		x8.run(array, 70001, 80000,8);
		x9.run(array, 80001, 90000,9);
		x10.run(array, 90001, 100000,10);
	
		
		
		
		
		
		
		System.out.println("Sum: " + MultiThreadingClass.total);
		
			
	}


}


