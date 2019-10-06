package IfStatements;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #4


import java.util.Scanner;

public class BMR {
	
public static void main(String[] args) {
	
Scanner scan = new Scanner (System.in);

System.out.println("Enter your height (in inches): ");
int height = scan.nextInt();

System.out.println("Enter your weight (in pounds): ");
int weight = scan.nextInt();

System.out.println("Enter your age: ");
int age = scan.nextInt();

System.out.println("Enter your gender (M or F): ");
char gender = scan.next(".").charAt(0);

double bmr=0; 
String gender2 = ".";

if (gender == 'm' || gender == 'M'){
	gender2 = "Male";
	bmr = (66+(6.23*weight) + (12.7*height) - (6.8*age));
}

else if (gender == 'f' || gender == 'F'){
	gender2 = "Female";
	bmr = (655+(4.35*weight) + (4.7*height) - (4.7*age));
}

System.out.println("Select your level of activity: ");
System.out.println("1) You don't excercise");
System.out.println("2) You engage in light excercise 1-3 days a week");
System.out.println("3) You excercise moderately 3-5 times a week");
System.out.println("4) You excercise intensely 6-7 times a week");
System.out.println("5) You excercise intensely 6-7 days a week and have a phisically active job");

bmr = ((bmr*10)/10);
int activity = scan.nextInt();
double intake=0;

switch (activity){
	case 1: intake = bmr * 1.2;
	break;
	case 2: intake = bmr * 1.375;
	break;
	case 3: intake = bmr * 1.55;
	break;
	case 4: intake = bmr * 1.725;
	break;
	case 5: intake = bmr * 1.9;
}


intake = ((intake*10)/10);

System.out.println("Results:\n ");
System.out.println(gender2 + ", " + height + "\", " + weight + " lbs, " + "Age " + age + ", " + "BMR = " + bmr  + ", " + "Level of activity: " + activity + ", " + "DCA (Daily Caloric Allowance): " + intake);
scan.close();
}
}




