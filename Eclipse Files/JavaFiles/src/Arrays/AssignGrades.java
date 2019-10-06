package Arrays;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #13


import java.util.Scanner;

public class AssignGrades {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the number of students in the class:");
		
		int classSize = scan.nextInt();
		
		int[] classroom = new int [classSize];	
		
		int count = 0;
		
		System.out.println("Please enter the grades of the " + classSize + " students in the class (0 to 100):");
		
		while (count < classSize) {
			
			classroom[count] = scan.nextInt();
			if (classroom[count] > 100 || classroom[count] < 0) {
				System.out.println("(Grade not valid. Try again)");
				continue;
				
			}
			count++;	
		}
		
		System.out.println("Class Size: " + classSize);
		System.out.print("Entered grades: ");
		
		count = 0;
		while (count < classSize) {
			System.out.print(classroom[count] + ", ");
			count++;
		}
		
		System.out.println();
		printGrades(classroom);
		
		scan.close();
		
	}
	
		static void printGrades (int[] array) {
			
			
			for (int count = 0; count < array.length; count++) {
				
				if (array[count] >= 90 && array[count] <= 100) {
					System.out.println("Student " + count + " score is " + array[count] + " and grade is A");
				}
				else if (array[count] >= 80 && array[count] <= 89) {
					System.out.println("Student " + count + " score is " + array[count] + " and grade is B");
				}
				else if (array[count] >= 70 && array[count] <= 79) {
					System.out.println("Student " + count + " score is " + array[count] + " and grade is C");
				}
				else if (array[count] >= 60 && array[count] <= 69) {
					System.out.println("Student " + count + " score is " + array[count] + " and grade is D");
				}
				else {
					System.out.println("Student " + count + " score is " + array[count] + " and grade is F");
				}
				
				}
			}
			
		
			
		}
		
		
	


