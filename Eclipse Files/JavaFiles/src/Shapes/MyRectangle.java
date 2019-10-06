package Shapes;


import java.util.Scanner;



public class MyRectangle {
	
public static void main (String[] args)

{
	
Scanner scan = new Scanner(System.in);

System.out.println("Enter the width of the rectangle: ");
int width = scan.nextInt();
System.out.println("Enter the height of the rectangle: ");
int height = scan.nextInt();

boolean a = isValid(width, height);
int b = Area(width, height);
int c = Perimeter(width, height);

System.out.println("Entered width:  " + width);
System.out.println("Entered height: " + height);


if (isValid(width, height) == false) {
	System.out.println("This is not a valid Rectangle. Try again.");
}
else if (a == true) {
	
	System.out.println("Area:           " + b);
	System.out.println("Perimeter:      " + c);
	
}
scan.close();

}

public static boolean isValid(int width, int height) {
	
	int operation = width + height;
	boolean condition;
	
	if (operation >= 30) {
		
		condition = true;
	}
	else {
		condition = false;
	}
	
	return condition;
}

static int Area(int width, int height) {
	
	int operation = width * height;
	
	return operation;
	
}

public static int Perimeter(int width, int height) {
	
	int operation = width *2 + height *2;
	
	return operation;
}




}