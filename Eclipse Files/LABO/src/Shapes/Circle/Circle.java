package Shapes.Circle;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #12

public class Circle {
	
	private double radius = 1;
	
	Circle(){
	}

	
	double getRadius() {
		
		return radius;
	}
	
	double setRadius(double radius) {
		
		this.radius = radius;
		
		return radius;
	}
	
	double getArea() {
		
		double area = 3.14 * (radius * radius);
		
		return area;
	}
	
	double getCircumference() {
		
		double circumference = 2 * 3.14 * radius;
		
		return circumference;
	}
	
	String ToString() {
		
		String description = "The radius of the circle is " + radius;
		
		return description;
	}
	
}
