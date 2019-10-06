package Recursion;


public class RecursionB {

	public static void main(String[] args) {
		
		String word = "madam";
	
		System.out.println("Is it a Palindrome: " + Palindrome(word));

	}
	
	public static String Palindrome(String word) {
		
		
		if (word.length() <= 1) {
			return "Yes";
		}
		
		if (word.charAt(0) == word.charAt(word.length()-1)){
			
			return Palindrome(word.substring(1, word.length()-1));
		}
		else {
			return "No";
			
		}
		
	}
		
		
	}


