package Loops;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #4

public class FeetMeters {
	
public static void main (String[] args)

{
	


float meter = 1f;
float feet = 1f;
System.out.println("Feet   " + "  Meter" + "          Meter   " + "Feet\n");

while (feet <= 9 && meter <=9) {
	
	System.out.print((int) feet + ":       " +  feetToMeter(feet) + "\t" + "\t");
	System.out.print((int) feet + ":      " + meterToFeet(meter));
	System.out.println();
	feet++;
	meter++;
}




while (feet > 9 && feet <= 20) {
	
	System.out.print((int) feet + ":      " + feetToMeter (feet) + "\t\t");
	System.out.print((int) feet + ":     " + meterToFeet(meter));
	System.out.println();
	feet++;
	meter++;
}

}

public static float feetToMeter(float feet) {
	
	float meter = (float) (0.305 * feet);
	
	return meter;
	
}

public static float meterToFeet (float meter) {
	
	float feet = (float) (3.279 * meter);
	
	
	return feet;
}





}