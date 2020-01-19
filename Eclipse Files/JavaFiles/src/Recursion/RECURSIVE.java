package DataStructures;

public class RECURSIVE {

	public static void main(String[] args) {
		
System.out.println(printNumbers(6));

	}
	
	public static String printNumbers(int n) {
		
		if (n == 1) {
			
			return "1";
		}
		
		else {
			int math = n * n;
			return printNumbers(n-1) + " " + math;
		}
	}

}
