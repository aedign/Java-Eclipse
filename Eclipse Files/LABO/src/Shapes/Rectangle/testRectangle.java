package Shapes.Rectangle;

	public class testRectangle{	
		
		public static void main (String[] args) {
		
		Rectangle z1 = new Rectangle();
		
		Rectangle z2 = new Rectangle(5, 6);
		
		System.out.println("First Rectangle:\n ");

		System.out.println("Height: " + z1.getHeight() + " units");
		System.out.println("Width: " + z1.getWidth() + " units" );
		System.out.println("Area: " + z1.getArea() + " units");
		System.out.println("Perimeter: " + z1.getPerimeter()  + " units" + "\n");
		
		
		System.out.println("Second Rectangle:\n ");

		System.out.println("Height: " + z2.getHeight() + " units");
		System.out.println("Width: " + z2.getWidth() + " units");
		System.out.println("Area: " + z2.getArea() + " units");
		System.out.println("Perimeter: " + z2.getPerimeter()  + " units");
	}
	}
