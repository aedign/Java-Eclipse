package Loops;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #9


import java.util.Scanner;

public class GuessTheNumber {
	
public static void main(String[] args) {
	
	
Scanner scan = new Scanner (System.in);

int a = 1;
int b = 3;

int guess=0;
int count = 0;

int x = userGuess (guess);
int random = randomNumber(a,b);

@SuppressWarnings("unused")
boolean Correct;



while (count < 1) {
	
	System.out.println("The secret number was: " + random);

	System.out.println("Would you like to play again? (Enter \"1\" for YES and \"2\" for NO)");
	int decision = scan.nextInt();
			if (decision == 1) {
				random =  randomNumber(a,b);
				x = userGuess(guess);
				Correct = Correct(x, random);
			}
			else if (decision == 2) {
				System.out.println("You gave up quickly :)");
			count++;	
			scan.close();
			}
	
		
	}

scan.close();

	
}



public static int randomNumber(int a, int b) {
	
	int randomNumber = (int) (Math.random() * b + a);
	return randomNumber;
}

public static int userGuess (int guess) {
	
	@SuppressWarnings("resource")
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter your guess: ");
	guess = scan.nextInt();
	

	return guess;
}

public static boolean Correct (int x, int random) {

	boolean Correct = false;
	
	if (x == random) {
		Correct = true;
		System.out.println("Your guess is correct!");
	}
	
	else if (x > random) {
		Correct = false;
		System.out.println("Your guess was too high");
	}
	
	else if (x < random) {
		Correct = false;
		System.out.println("Your guess was too low");
	}

	return Correct;

}





}
