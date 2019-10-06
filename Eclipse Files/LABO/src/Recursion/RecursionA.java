package Recursion;


public class RecursionA {

	public static void main(String[] args) {
		
		String word = "guasa";
		System.out.println(vowels(word));
		
		
	//	https://stackoverflow.com/questions/19384340/recursive-vowel-counter
		

	}

	
		public static int vowels(String word) {
			
			if (word.length() <1) {
				return 0;
			}
			else if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u' ) {
				
				return 1 + vowels(word.substring(1));
			}
			else {
				return vowels(word.substring(1));
			}
			
		}
}


