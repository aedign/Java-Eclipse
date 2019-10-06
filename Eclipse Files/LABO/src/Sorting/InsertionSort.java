package Sorting;


public class InsertionSort {

	public static void main(String[] args) {
		
		
		int [] array = new int [5];
		
		for (int count = 0; count < array.length; count++ ) {
			
			array[count] = (int) (Math.random() * 10 + 0);
			
		}
		
for (int count = 0; count < array.length; count++ ) {
			
			System.out.println(InsertionSort(array)[count]);
			
		}

int gg = 100-(40+(200/(10-5)*2)/4)+50;

System.out.println(gg);
		

	}
	
public static int [] InsertionSort (int [] array) {
		
		
		for (int count = 1; count < array.length; count++) {
			
			int key = array[count];
			int position = count;
			
			while (position > 0 && key < array[position-1]) {
				
				array[position] = array[position-1];
				position--;

			}
			
			array[position] = key;
		
			
			
		}

		return array;
	}

}
