package Loops;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #4


import java.util.Scanner;


public class PalindromicPrime {
	
public static void main (String[] args) 
{
	
Scanner scan = new Scanner(System.in);

int number = 100;
int count = 0; 

	while (number<=1000 && count <= 50) {
		if (isPalindrome(number) == true && isPrime(number) == true) {

		System.out.print(number + "   ");
		count++;
			if (count%10 == 0) {
				System.out.println();
			}

		}
		number++;
	
	}
	
	scan.close();
}

public static boolean isPalindrome (int number) {
	
	int math = 0;
	int number2 = number;
	boolean isPalindrome;
	
	while (number > 0) {
		int math2 = number%10;	
		math = (math *10) + math2;
		number = number /10;
	}
	
	int reverse = math;
	
	if (reverse == number2) {
		isPalindrome = true;
	}
	else {
		isPalindrome = false;
	}
	
	return isPalindrome;
	
	}

public static boolean isPrime(int number) {
	
	boolean isPrime;
	
	if (number%2 == 1) {
		isPrime = true;
	}
	else {
		isPrime = false;
	}
	return isPrime;
}





}

