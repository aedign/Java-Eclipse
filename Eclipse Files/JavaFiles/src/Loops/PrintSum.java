package Loops;



//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #3


import java.util.Scanner;

public class PrintSum

{
	
public static void main (String[] args)

{
Scanner scan = new Scanner (System.in);

int math = 0;
int sum = 0;

System.out.println("Please enter a number between 1 and 100: ");
int number = scan.nextInt();


if (number >= 1 && number <= 100){

	while (math < number){
		math = math + 1;
		sum = sum + math;
		
		}
		
		System.out.println("You entered: " + number);
		System.out.println("Sum of values: " + sum);

	}

else System.out.println("This is an invalid number. Try again.");
scan.close();

}
}

