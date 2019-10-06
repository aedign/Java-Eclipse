package Shapes;

import java.util.Scanner;



public class ComputeAreas {
	
public static void main (String[] args)

{
	
Scanner scan = new Scanner(System.in);

System.out.println("Enter the side of a square: ");
double side = scan.nextDouble();
double a = squareArea(side);

System.out.println("Enter the width and the length of a rectangle: ");
double width = scan.nextDouble();
double length = scan.nextDouble();
double b = rectangleArea (width, length);

System.out.println("Enter the radius of a circle: ");
double radius =  scan.nextDouble();
double c = circleArea(radius);

System.out.println("Enter the base and the height of a triangle: ");
double base = scan.nextDouble();
double height = scan.nextDouble();
double d = triangleArea(base, height);

System.out.println("(Results are rounded)");

System.out.println("Square side: " + side);
System.out.println("Square area: " + a);

System.out.println("Rectangle width: " + width);
System.out.println("Rectangle length: " + length);
System.out.println("Rectangle area: " + b);

System.out.println("Circle radius: " + radius);
System.out.println("Circle area: " + c);

System.out.println("Triangle base: " + base);
System.out.println("Triangle height: " + height);
System.out.println("Triangle area: " + d);
scan.close();
}

public static double squareArea (double width) {
	
	double squareArea = width * width;
	
	squareArea = Math.round(squareArea);
	
	return squareArea;
	
}

public static double rectangleArea(double num1, double num2) {

double rectangleArea = num1 * num2;

rectangleArea = Math.round(rectangleArea);

return rectangleArea;

}

public static double circleArea(double num1) {
	
double circleArea = (num1 *num1)* Math.PI;

circleArea = Math.round(circleArea);

return circleArea;

}

public static double triangleArea(double num1, double num2) {
	
	double triangleArea = (num1*num2)/2;
	
	triangleArea =Math.round(triangleArea);
	
	return triangleArea;
	
}





}