package FlipCoin;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #6

public class testCounter {
	
	public static void main (String[] args) {
		
		Counter Heads = new Counter();
		Counter Tails = new Counter();
		
		int a = 1;
		int b = 2;
		
		int counter = 1;
		
		while (counter <= 100) {
			
			int randomNumber = (int) (Math.random() * b + a);
			
			if (randomNumber == 1) {
				Heads.increment();
				}
				
			else {
				Tails.increment();
			}
			counter++;
		}
		
		System.out.println("Results after tossing the coin 100 times: \n" );
		System.out.println("Heads: " + Heads.getValue() + " times");
		System.out.println("Tails: " + Tails.getValue() + " times");
		
		
		

}
}
