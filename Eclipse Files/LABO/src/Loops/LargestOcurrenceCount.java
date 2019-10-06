package Loops;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #4

import java.util.Scanner;

public class LargestOcurrenceCount {
public static void main(String[] args) {
		
Scanner scan = new Scanner (System.in);

System.out.println("Enter whole numbers (enter 0 to quit): ");


int number = -1;
int largest = 0;
int counter = 0;


while (number != 0) {
number = scan.nextInt();
	if (number > largest) {
		largest = number;
		counter = 1;
	}
	else if (number == largest) {
		counter +=1;
	}
}


System.out.println("Largest number is: " + largest);
System.out.println("That number was entered: " + counter + " time(s)");
scan.close();
}
}
