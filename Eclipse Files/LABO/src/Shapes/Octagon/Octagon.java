package Shapes.Octagon;

// Andres Di Gregorio
//Kevin Markley
public class Octagon extends GeometricObject implements Comparable, Cloneeable{
	
	private double side;
	
	Octagon(){
		
		
	}
	
	public void setSide(double side) {
		
		this.side = side;
	}
	public double getSide() {
		
		return this.side;
	}
	
	
	public double Area() {
		
		double area = ((2+4/(Math.sqrt(2)))*side*side);
		
		area = (Math.round(area*100.0)/(100.0));
		
		return area;
	}
	
	public double Perimeter() {
		
		return 8 * side;
	}

	public Octagon Clonee() {
		
		Octagon o2 = new Octagon();
		o2.setSide(side);
		o2.Area();
		o2.Perimeter();
		return o2;
		
		}



	public boolean Comparable(Octagon o1, Octagon o2) {
		
		if (o1.Area() == o2.Area() && o1.Perimeter() == o2.Perimeter() && o1.getSide() == o2.getSide()) {
		
			return true;
		}
		return false;
	}

	
	
}
