package Shapes.Rectangle;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #10




public class Rectangle {
	
	private double height;
	private double width;
	
	Rectangle() {
		
		height = 1;
		width = 1;
}

	Rectangle(double x, double y){
	
	height = x;
	
	width = y;	
}
	
	double getArea() {
		
		double math = width * height;
		
		return math;
		
	}
	
	public double getPerimeter() {
		
		double math = width *2 + height *2;
		
		return math;
	}
	
	public double getHeight() {
	
	return height;
	}
	
	public double getWidth() {
		
		return width;
	}
	
}
	




