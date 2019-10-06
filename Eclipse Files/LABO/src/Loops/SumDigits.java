package Loops;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #9


import java.util.Scanner;

public class SumDigits {
	
public static void main(String[] args) {
	
Scanner scan = new Scanner (System.in);


System.out.println("Please enter a number: ");
int x = scan.nextInt();

System.out.println("You entered: " + x);
System.out.println("Sum of all digits: " + SumTheDigits(x));

scan.close();

}

public static int SumTheDigits (int x) {
	
	int SumDigits = 0;
	int math = 0;
	
	while (x > 0) {
	math = x % 10;
	SumDigits = SumDigits + math;
	x = x/10;
}
	
	
	
	return SumDigits;
	
	
	
}


}