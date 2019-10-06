package Loops;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #9


import java.util.Scanner;

public class PrintCharacters {
	
public static void main(String[] args) {
	
Scanner scan = new Scanner (System.in);


System.out.println("Enter a start character: ");
char a = scan.next().charAt(0);
System.out.println("Enter an end character: ");
char c = scan.next().charAt(0);
printChars(a,c);
scan.close();

}

public static void printChars (char a, char c) {
	
	

	System.out.println("Start character: " + a);
	System.out.println("End character: " + c);
	System.out.println("Output: " );
	

	int math = a;
	int math2 = c;
	int counter = 0;
	
	if (math > math2) {
		
		System.out.println("Characters are out of order. Try again.");
	}
	
	else {
	
	
	while (math <= math2 ) {
	
		
		a = (char) math;
		if (counter % 5 ==0) {
			System.out.println();
		}
		System.out.print(a + " ");
		math ++; 
		counter++;
		
		
	}
	}
	
	
	
	
}
}
