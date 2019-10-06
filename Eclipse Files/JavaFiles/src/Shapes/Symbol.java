package Shapes;

import java.util.Scanner;

public class Symbol {
	
public static void main(String [] args) {
	
	Scanner scan = new Scanner (System.in);
	
System.out.println("Enter a symbol: ");
char symbol = scan.next().charAt(0);

System.out.println("Enter a number: ");
int number = scan.nextInt();

int x;
int y;

for (x =1; x <= number;x++ ) {
	for (y = 1; y <= number; y++) {
		System.out.print(symbol);
	}
	System.out.println();
}
scan.close();
}
}
