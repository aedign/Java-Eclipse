package IfStatements;

import java.util.Scanner;



public class MinMaxAvg {
	
public static void main (String[] args)

{
	
Scanner scan = new Scanner(System.in);

System.out.println("Enter three integer values: ");

int x= scan.nextInt();
int y= scan.nextInt();
int z= scan.nextInt();
int a = max(x, y,z );
int b = min(x, y, z);
int c = average(x,y,z);


System.out.println("You entered: " + x + ", " + y + ", " + z);
System.out.println("Maximum value: " + a);
System.out.println("Minimum value: " + b);
System.out.println("Average value: " + c);
scan.close();
}

public static int max(int num1, int num2, int num3) {
	
	int max;
	
	
	if (num1 > num2 && num1> num3) {
		max = num1;
		
	}
	else if (num2 > num1 && num2 > num3) {
		max = num2;
	}
	else {	
		max = num3;
	}
	return max;	
}


public static int min (int num1, int num2, int num3) {
	
	int min;
	
	if (num1 < num2 && num1< num3) {
		min = num1;
		
	}
	else if (num2 < num1 && num2 < num3) {
		min = num2;
	}
	else {	
		min = num3;
	}
	return min;	
}

public static int average(int num1, int num2, int num3) {
	
	int average;
	
	average = (num1 + num2 + num3)/3;
	return average;	
	
	}
	
}






