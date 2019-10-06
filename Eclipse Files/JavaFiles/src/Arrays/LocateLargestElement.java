package Arrays;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #12

public class LocateLargestElement {

	public static void main(String[] args) {
		
		int[][] array = new int [3][4];
		
		for (int r = 0;r < array.length; r++){
			
			for (int c = 0; c < array[r].length; c++ ) {
				
				array[r][c] = (int) (Math.random() * 100 +1);
				
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
		
		System.out.println("The largest value is located at row " + locateLargest(array)[0] + " and column " + locateLargest(array)[1]);
}
	
	
	public static int[] locateLargest(int [][] array){
		
		int [] array1 = new int[2];
		int max = 0;
		
		for (int r = 0;r < array.length; r++){
			
			for (int c = 0; c < array[0].length; c++ ) {
				
				if (array[r][c] > max) {
					max = array[r][c];
					array1[0] = r;
					array1[1] = c;
				}
				
			}
			
		}

return array1;
		
		
		
		
	}
	
	
	
	
	

}
