package WeeklyHours;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #7

public class WeeklyHours {

	public static void main(String[] args) {
		
		int[][] array1 = new int [3][7];
		
		System.out.println("\t\tMon\tTue\tWed\tThu\tFri\tSat\tSun\t\n");
		
		
		for (int r = 0; r < array1.length; r++) {
			
			if (r == 0) {
				System.out.print("Employee 1:  \t ");
			}
			else if (r == 1) {
				System.out.print("Emplo   \t ");
			}
			else {
				System.out.print("Employee 3:  \t ");
			}
			
			for (int c = 0; c < array1[r].length; c++) {
				
				array1[r][c] = (int) (Math.random() * 10 + 1);
				
				System.out.print(array1[r][c] + "\t");
				
			}
			System.out.println();
	
		}
		
		System.out.println();
		
		addHours(array1);
		
		
	}
	
	static void addHours(int[][] array) {
		
		
		
		System.out.println("Employe#\t Weekly Hours");
		
		for (int r = 0; r < array.length; r++) {
			
			int sum =0;
			
			for (int c = 0; c < array[r].length; c++) {
				
				sum = sum + array[r][c];
				
			}
			if (r == 0) {
				System.out.println("1   \t\t     " + sum);
			}
			else if (r == 1) {
				System.out.println("2   \t\t     " + sum);
			}
			else {
				System.out.println("3   \t\t     " + sum);
			}
		}
		
		
		
		
		
		
	}
}
