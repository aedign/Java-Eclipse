package Shapes;



//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #4

import java.util.Scanner;

public class Pattern {
public static void main(String[] args) {
		
Scanner scan = new Scanner (System.in);

int maxnumber = 6;

for (int x = 1; x <= 6; x +=1) {
	for (int space = 6; space > maxnumber; space--) {
		System.out.print(" ");
	}
		for (int number = 1; number <= maxnumber; number +=1) {
		System.out.print(number);
			
}
	System.out.println();
	maxnumber -= 1;
	scan.close();

}	
		

		
		
		
		
		
		
		
		
		
		
}	
}
