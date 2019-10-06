package Arrays;

// Andres Di Gregorio

import java.util.Scanner;

public class Tests {
	
	Scanner scan = new Scanner (System.in);
	
	private String name;
	private String lastname;
	private int [] testscores = new int [5];
	private double avgscore = 0;
	private char grade;

	
	Tests(){
		
	}
	
	Tests (String name, String lastname){
		
		this.name = name;
		this.lastname = lastname;

	}
	
	
public void setName(String name) {
		
		this.name = name;
	}
	
public String getName() {
		
		return name;
		
		
	}


public void setLastName(String lastname) {
		
		this.lastname = lastname;
	}
	
public String getLastName() {
		
		return lastname;
		
		
	}


public void setTestScores (int [] testscores) {
	
	for (int count = 0; count < testscores.length; count++) {
		
		this.testscores[count] = scan.nextInt();
		
	}
	
	
}

public int [] getTestScores () {
	
	return testscores;
}


public void setAvgScore (int [] array) {
	
for (int count = 0; count < testscores.length; count++) {
		
		avgscore += testscores[count];
		
	}
	
avgscore = (avgscore/testscores.length);
	
	
}

public double getAvgScore() {
	
	return avgscore;
}
	
	
public char setGrade () {
	
	if (getAvgScore() >= 90) {
		
		grade = 'A';
	}
	
	else if (getAvgScore() >= 80 && getAvgScore() < 90) {
		
		grade = 'B';
	}
	
	else if (getAvgScore() >= 70 && getAvgScore() < 80) {
		
		grade = 'C';
	}
	
	else if (getAvgScore() >= 60 && getAvgScore() < 70) {
		
		grade = 'D';
	}
	
	else {
		
		grade = 'F';
	}
	
	return grade;
	
}

public char getGrade() {
	
	return grade;
}




 	public static void main(String[] args) {
 		
 		Scanner scan = new Scanner (System.in);
 		
 		int [] array = new int [5];
 		
 		Tests [] student = new Tests [3] ;
 		
 		double classAvg = 0;
 		
 		for (int count = 0; count < student.length; count++) {
 			
 			System.out.println("Enter the first name of the student " + (count+1) + ":");
 	 	
 	 		String name = scan.nextLine();
 	 		
 	 		System.out.println("Enter the last name of the student " + (count+1) + ":");
 	 		
 	 		String lastname = scan.nextLine();
 			
 			student[count] = new Tests (name, lastname);
 			
 			System.out.println("Enter 5 test scores: ");
 			
 			student[count].setTestScores(array);
 				
 			student[count].setAvgScore(array);	

 			student[count].setGrade();
 			
 			
 		}
 		
 		System.out.println("First Name\t" + "Last Name\t" + "Test 1\t" + "Test 2\t" + "Test 3\t" + "Test 4\t" + "Test 5\t" + "Average\t" + "Grade\n" );
 		
 		
 		
 		for (int count = 0; count < student.length; count++) {
 			
 		
 			System.out.print(student[count].getName() + "\t" + "\t");
 			System.out.print(student[count].getLastName() + "\t" + "\t");
 			
 			for (int count2 = 0; count2 < array.length; count2++) {
 				
 				System.out.print(student[count].testscores[count2] + "\t  ");
 				
 			}
 			
 			System.out.print(student[count].getAvgScore() + "\t  ");
 			
 			classAvg = classAvg + student[count].getAvgScore();
 			
 			System.out.print(student[count].getGrade());
 			
 			
 			
 		System.out.println();
 		}
 		System.out.println();
 		System.out.println("Class Average: " + (classAvg/student.length));
 		
 		
 		scan.close();
 		
 		
 		
		

	}

}
