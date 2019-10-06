package IfStatements;

import java.util.Scanner;

public class SumEven {
	
	public static void main(String[] args) {

		
		Scanner scan = new Scanner (System.in);

System.out.println("Enter a number between 20 and 60: ");	
int number = scan.nextInt();



int sum2 =0;

if (number >= 20 && number <= 60) {
		for (int number2 = 2; number2 <= number; number2++) {
		if (number2 % 2 == 0) {
	 sum2 = sum2 + number2;
		}
	}

System.out.println("You entered: " + number);
System.out.println("Sum of all even numbers is: " + sum2);

}
else {
	System.out.println("Invalid number. Try again. ");
}

scan.close();
	
}

	}

