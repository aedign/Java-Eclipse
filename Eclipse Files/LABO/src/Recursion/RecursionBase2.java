package Recursion;

import java.util.Scanner;

//Andres Di Gregorio

public class RecursionBase2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		System.out.println("Enter the desired base (between 2 and 36): ");
		int base = scan.nextInt();
		
		System.out.println("Result: " + GetNum(num,base));
		scan.close();

	}
	
	public static String GetNum(int num, int base) {
		
		int division = num/base;
		int modulus = num%base;
		
		String add = "";
		add = Integer.toString(modulus);
		
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		if (num < base && modulus < 10) {
			
			return add;
		}
		if (num < base && modulus > 10) {
			add = abc.substring(modulus-10, (modulus-9));
			return add;
			
			
		}
		
		else if (modulus < 10){
			return GetNum(division,base) + add;
		}
		else {
			add = abc.substring(modulus-10, (modulus-9));
			return GetNum(division,base) + add;
		}
		
		
		
		
		
	}

}
