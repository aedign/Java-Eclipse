package Shapes.Octagon;

// Andres Di Gregorio
//Kevin Markley
public class OctagonTest {
	
	public static void main(String [] args) {
		
		Octagon o1 = new Octagon();
		o1.setSide(8);
		System.out.println("Octagon 1: ");
		System.out.println("Area: " + o1.Area());
		System.out.println("Perimeter: " + o1.Perimeter());
		
	System.out.println();

		Octagon o2 = o1.Clonee();
		System.out.println("Octagon 2 (cloned): ");
		System.out.println("Area: " + o2.Area());
		System.out.println("Perimeter: " + o2.Perimeter());
		System.out.println();

		Comparable o9 = new Octagon();
		System.out.println("Are 1 and 2 equal?: " + o9.Comparable(o1, o2));
		

		
	}

}
