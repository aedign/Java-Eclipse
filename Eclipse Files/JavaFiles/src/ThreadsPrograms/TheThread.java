package ThreadsPrograms;


public class TheThread extends Thread{
	
	public void run() {
		
		
		try {
			
			System.out.println(Thread.currentThread().getId() + " is running");
		}
		catch (Exception e) {
			System.out.println("Exception caught");
		}
	}

}

class TestThread {
	
	public static void main(String [] args) {
		
		Thread t1 = new Thread();
		
		System.out.println("lklilkl");
		
		t1.run();

	
}
}

