package Arrays;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #12

public class SumArrayColumns {

	public static void main(String[] args) {

int[][] array = new int [3][4];

for (int r = 0;r < array.length; r++){
	
	for (int c = 0; c < array[r].length; c++ ) {
		
		array[r][c] = (int) (Math.random() * 10 +1);
		
	}
	
}

System.out.println("The entered matrix: \n");

for (int r = 0;r < array.length; r++){
	
	for (int c = 0; c < array[r].length; c++ ) {
		
		System.out.print(array[r][c] + "\t");
		if (c == 3) {
			System.out.println();
		}
	}
}
 System.out.println();
	
int count =0;

	for (int r = 0;r < 4; r++){

			System.out.print("Sum of column " + r + " is " + sumColumn(array)[count] + "\t" + "\n");
			count++;
		}
		
	
	}
	
	
public static int[] sumColumn (int[][] array2) {
	
	
	
	int[] array1 = new int [4];
	
	int count = 0;
	
	
	for (int c = 0; c < array2[0].length; c++) {
		
		int sum = 0;
		
		for (int r =0; r < 3; r++) {
			
			sum = sum + array2[r][c];
		}
		array1[count] = sum;
		count++;
	}
		return array1;
		
		
	}

}
