//Andres Di Gregorio
package DataStructures;

import java.util.Scanner;

public class ArrayList {
	
	int [] ClassArray;
	
	
	ArrayList(){
		
		ClassArray = new int [10];
		
	}
	
	ArrayList(int size){
		
		ClassArray = new int[size];
		
	}

	
	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Insert the length of the Array list:");
		int length = scan.nextInt();
		
		System.out.println("Enter the values of the Array list:");
		
		ArrayList list1 = new ArrayList(length); // Not an array, a class object with an array inside
		
		int sum=0;
		
		for (int count= 0; count < length; count++) {
			
			list1.add(scan.nextInt());
			sum += list1.getElementIndex(count);
		}
		
		System.out.println( "Sum of values in the list: " + sum);
		scan.close();
		

	}
	
	public void add(int num){
		
		int i =0;
		
		while(ClassArray[i] != 0) {
			
			i++;
		}
		
		ClassArray[i] = num;
		
	}
	
	public int getElementIndex(int index) {
		
		return ClassArray[index];
	}

	

}