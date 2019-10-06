package Loops;

import java.util.Scanner;



public class PalindromeInteger {
	
public static void main (String[] args)

{
	
Scanner scan = new Scanner(System.in);

System.out.println("Enter an integer value: ");
int value = scan.nextInt();
int value2 = value;
int a = reverse(value2);
boolean b = isPalindrome(value, a);

System.out.println("You entered: " + value);

if (b == true) {
System.out.println("Judgment: Palindrome");
}
else if (b == false){
	System.out.println("Judgment: Not a Palindrome");
}
scan.close();
}

public static int reverse(int value2) {
	
	int operation2 = 0;
	
	while (value2 > 0) {
		int operation = value2%10;	
		operation2 = (operation2 *10) + operation;
		value2 = value2 /10;
	}
	int reverse = operation2;
	
	return reverse;
}

public static boolean isPalindrome (int value, int a) {
	
	boolean isPalindrome;
	if (value == a) {
		isPalindrome = true;
	}
	else {
		isPalindrome = false;
	}

	return isPalindrome;
}
}