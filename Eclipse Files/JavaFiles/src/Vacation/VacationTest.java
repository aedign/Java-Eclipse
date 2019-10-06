package Vacation;


// Andres Di Gregorio
import java.util.Scanner;


public class VacationTest {

	
	public static void main (String [] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your desired destination: ");
		String destination = scan.nextLine();
		System.out.println("Enter your budget: ");
		int budget = scan.nextInt();
		System.out.println();
		
		InclusiveVacation iv = new InclusiveVacation(destination, budget, "Delta Trips", 4.5, 12600);
		iv.HowMuch();
		

		System.out.println();
		
		PiecemealVacation pv = new PiecemealVacation(destination, budget, 1000, 1000, 1500, 200, 500);
		pv.HowMuch();
		scan.close();
	}
	
	

}
