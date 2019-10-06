package Loops;



//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #3


import java.util.Scanner;

public class EvenOdd

{
	
public static void main (String[] args)

{
Scanner scan = new Scanner (System.in); 


int sum;

int even = 50;

int odd = 50;

System.out.print("Even numbers: "); 

while (even <= 100) {
	
	
	sum = even % 2;
	
	
	
	if (sum == 0) {
		
		
		System.out.print( even + ", ");
		
}
	even = even + 1;
}

System.out.println();
System.out.print("Odd numbers: "); 

while (odd >= 50 && odd <=99) {
	
	odd = odd +1;
	sum = odd %2;
	
	if (sum == 1) {
		System.out.print(odd + ", ");
	}
	
}

scan.close();

}
}