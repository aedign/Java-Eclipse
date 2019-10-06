package Shapes;

import java.util.Scanner;

public class Shape {
	
public static void main(String[] args) {

	
Scanner scan = new Scanner (System.in);
	
int x, y, z;
int space =7;

for (x = 1; x <= 15; x+= 2){
	for (z = space; z > 0; z--) {
		System.out.print(" ");
	}
	for (y = 1; y <=x; y +=1){
		System.out.print("*");
	}
	System.out.println();
	space -= 1;
}
scan.close();
}
}
