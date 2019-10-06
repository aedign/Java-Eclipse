package Shapes.Circle;


public class testCircle {
	
	public static void main (String[] args) {
		
		Circle c1 = new Circle();
		
		System.out.println("Print radius:\n " + "The radius is " + c1.getRadius() + "\n");
		System.out.println("Print area:\n " + "The area is " + c1.getArea() + "\n");
		System.out.println("Print Circumference:\n " + "The circumference is " + c1.getCircumference() + "\n");
		
		Circle c2 = new Circle();
		c2.setRadius(10);
		
		System.out.println("Set radius to 10:");
		
		System.out.println(c2.ToString() + "\n");
		System.out.println("Print area:\n " + "The area is " + c2.getArea() + "\n");
		System.out.println("Print Circumference:\n " + "The circumference is " + c2.getCircumference() + "\n");
		
	}

}
