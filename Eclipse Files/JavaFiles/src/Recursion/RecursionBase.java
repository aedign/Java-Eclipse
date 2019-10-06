package Recursion;


//Andres Di Gregorio
import java.util.Scanner;

public class RecursionBase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		double num = scan.nextDouble();
		System.out.println("Enter the desired base (between 2 and 36): ");
		double base = scan.nextDouble();
		
		System.out.println("Result: " + GetNum(num,base));
		
		scan.close();
	}
	
	public static String GetNum(double num, double base) {
		
		String getNum= "";
		String add = "";
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		double remain = (double) 1/base;
		remain = (double) Math.round(remain*(double)1000000000)/(double)1000000000;
		
		
		double piece;
		
		double math = (double) num/base;
		math = (double) Math.round(math*(double)1000000000)/(double)1000000000;
		
		
		if (math < remain && math > 0 ) {
			return getNum + "";
		}
		
		if (num < base && (num%base) > 10) {
			
			add = abc.substring((int)(num%base)-10, ((int)(num%base)-9));
			return add;
			
			
		}
		
		
		double aa = (double) math % 1;
		aa = (double) Math.round(aa*(double)1000000000)/(double)1000000000;
	
		
		
		
		if (aa == 0.0 ) {
			
			return  GetNum(math,base) + getNum + "0" ;
		}
		
		
		else {
			piece =  (aa/remain);
			
			if ((piece%1)/0.9 >= 1) {
				
				piece++;
				
			}
			
			int numToAdd = (int) piece;
			
		
			add = Integer.toString(numToAdd);
			
			
			
			if (piece <10) {
				 add = Integer.toString(numToAdd);
			}
			else {
				
				add = abc.substring(numToAdd-10, (numToAdd-10+1));
			}
	
			return  GetNum(math,base) + getNum +  add ;
		}
		
		
	}

}
