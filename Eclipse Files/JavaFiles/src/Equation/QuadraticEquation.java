package Equation;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #6

public class QuadraticEquation {
	
	private int a, b, c;
	
	QuadraticEquation(int a, int b, int c){
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	int getA(){
		
		
		return a;	
	}
	
	int getB(){
		
		return b;	
	}
	
	int getC(){
		
		return c;	
	}
	
	int getDiscriminant() {
		
		int discriminant = (b*b) - (4*a*c);	
		return discriminant;
		
	}
	double getRoot1() {
		
			double root1 = (-b + Math.sqrt(getDiscriminant()))/ (2 * a);
				return root1;		
	}
	
	double getRoot2() {
		
		double root2 = (-b - Math.sqrt(getDiscriminant()))/ (2 * a);
		return root2;
	}
	}
	
	
	


