package Loops;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #4


import java.util.Scanner;


public class PrintTableSeries {
	
public static void main (String[] args) 

{
	
Scanner scan = new Scanner(System.in);


System.out.println("Enter a number: ");
double number = scan.nextDouble();


double z = 1;
int count = 1;
double sum=0;

scan.close();

System.out.println("i" + "    Sum(i)\n");

	while (count<=number) {
	
		sum = sum + displaySums(z);
		System.out.println(count + "    " + sum);
		count++;
		z++;
	}

}

public static double displaySums(double z) {
	
	double math = z/(z+1);
	
	return math;
}


	
}






