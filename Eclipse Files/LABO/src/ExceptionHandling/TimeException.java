package ExceptionHandling;

// Andres Di Gregorio

import java.util.Scanner;

public class TimeException {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
	char decision = 0;
	String time = "";
	String minutes = "";
	
	
	try {		
		
		do {
			
			String timeOfDay = " AM";
		
			System.out.println("Enter time in 24-hour notation: ");
			time = scan.next();
			
			
			if (time.indexOf(":") == 1 && time.length() == 4 ) {
				
				int num = Integer.parseInt(time.substring(0,1));
				
				int num2 = Integer.parseInt(time.substring(2,4));
				
				if (num == 0) {
					
					num = 12;
				}
				
				if (num2 <10) {
					
					minutes = "0" + Integer.toString(num2);
					
				}
				
				else {
					
					minutes = Integer.toString(num2);
				}
				
				time = Integer.toString(num) + ":" + minutes + timeOfDay;
				System.out.println("Same time in 12-hour format: " + time);
				System.out.println("Again ? (y/n): ");
				decision = scan.next().charAt(0);
				
			}
			
			else if (time.indexOf(":") == 2 && time.length() == 5) {
			
				int num = Integer.parseInt(time.substring(0,2));
			
				int num2 = Integer.parseInt(time.substring(3,5));
			
				if (num < 24 && num2 <= 59){
					
					if (num == 12) {
						
						timeOfDay = " PM";
						
					}
				
					if (num > 12) {
				
						num = num -12;
						timeOfDay = " PM";
				
					}
					
					if (num == 0) {
						
						num = 12;
					}
					
					if (num2 <10) {
						
						minutes = "0" + Integer.toString(num2);
						
					}
					else {
						minutes = Integer.toString(num2);
					}
				
					if (num < 12) {
					
						time = Integer.toString(num) + ":" + minutes + timeOfDay;
						System.out.println(time);
					
					}
					else {
						time = Integer.toString(num) + ":" + minutes + timeOfDay;
						System.out.println("Same time in 12-hour format: " + time);
					}

					System.out.println("Again ? (y/n): ");
					decision = scan.next().charAt(0);
				}	
				
				else {
					
					throw new TimeFormatException("");
					
				}
				
			}
			
			else {
				
				throw new TimeFormatException("");
				
			}
			
		}while (decision != 'n');
		
	}	
	
	catch (TimeFormatException e) {

		System.out.println(e.getMessage());
				
				
			}
	
	scan.close();
		
	}


}


