package Equation;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #6

public class testEquation {
	
	public static void main (String[] args) {
		
		
	
	QuadraticEquation e1 = new QuadraticEquation(3, 8, 4);
	
	System.out.println("Sample run 1 for: " + e1.getA() + "x^2 + " + e1.getB() + "x + " + e1.getC() + ":\n" );
	System.out.println("a = " + e1.getA());
	System.out.println("b = " + e1.getB());
	System.out.println("c = " + e1.getC());
	if (e1.getDiscriminant() > 0) {
		System.out.println("Root 1 = " + e1.getRoot1());
		System.out.println("Root 2 = " + e1.getRoot2());
		}
		else {
			System.out.println("Root 1 is Undefined");
			System.out.println("Root 2 is undefined");
		}
	
	QuadraticEquation e2 = new QuadraticEquation(3, 4, 8);
	
	System.out.println();
	System.out.println("Sample run 2 for: " + e2.getA() + "x^2 + " + e2.getB() + "x + " + e2.getC() + ":\n" );
	System.out.println("a = " + e2.getA());
	System.out.println("b = " + e2.getB());
	System.out.println("c = " + e2.getC());
	if (e2.getDiscriminant() > 0) {
	System.out.println("Root 1 = " + e2.getRoot1());
	System.out.println("Root 2 = " + e2.getRoot2());
	}
	else {
		System.out.println("Root 1 is Undefined");
		System.out.println("Root 2 is undefined");
	}
	
QuadraticEquation e3 = new QuadraticEquation(2, 8, 2);
	
	System.out.println();
	System.out.println("Sample run 3 for: " + e3.getA() + "x^2 + " + e3.getB() + "x + " + e3.getC() + ":\n" );
	System.out.println("a = " + e3.getA());
	System.out.println("b = " + e3.getB());
	System.out.println("c = " + e3.getC());
	if (e3.getDiscriminant() > 0) {
		System.out.println("Root 1 = " + e3.getRoot1());
		System.out.println("Root 2 = " + e3.getRoot2());
		}
		else {
			System.out.println("Root 1 is Undefined");
			System.out.println("Root 2 is undefined");
		}
	
	
	
	}
}
