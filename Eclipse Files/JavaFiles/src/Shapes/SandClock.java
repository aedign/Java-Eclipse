package Shapes;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #4

import java.util.Scanner;
		
public class SandClock {
	
	public static void main (String[] args) {
		

		
Scanner scan = new Scanner (System.in);
		
int row, character;
int space = 0;

for (row = 9; row >=0; row = row - 2) {
	for (int x =0; x < space; x++) {
		System.out.print(" ");
	}
	
	for (character = 1; character <= row; character++) {	
		System.out.print("*");
		
		
	}
	System.out.println();
	space += 1;
}

int space2 =3;

for (row = 3; row <=9; row = row +2) {
	for (int y = space2; y > 0 ; y--) {
		System.out.print(" ");
		
	}
	for (character = 1; character <= row; character++) {	
		System.out.print("*");
	}
	System.out.println();
	space2 -= 1;
	
}


scan.close();

		
}

	}

