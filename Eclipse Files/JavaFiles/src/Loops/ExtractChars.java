package Loops;


//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Assignment #3


import java.util.Scanner;

public class ExtractChars

{
	
public static void main (String[] args)

{
Scanner scan = new Scanner (System.in); 



System.out.println("Enter a String: ");
String word = scan.next();

System.out.println(word);
int number = 1;
for (char c: word.toCharArray()) {
	
	
	System.out.println("Character number#" + number + ":" + c);
	number++;
	}

scan.close();
	
}

}