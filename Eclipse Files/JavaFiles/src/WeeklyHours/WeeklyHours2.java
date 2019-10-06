package WeeklyHours;


public class WeeklyHours2 {




	
	public static void main(String[] args) {
		
	
		
	int[][] array1 = { {1,2, 3, 10, 8, 5, 3}, {9, 7, 6, 4, 7, 1, 8}, {2,3,4,5,6,7,8,}};

		System.out.println("\t\tMon\tTue\tWed\tThu\tFri\tSat\tSun\t\n");
		
		for (int r = 0; r < array1.length; r++) {
			
			if (r == 0) {
				System.out.print("Employee 1:  \t ");
			}
			else if (r == 1) {
				System.out.print("Employee 2:  \t ");
			}
			else {
				System.out.print("Employee 3:  \t ");
			}
			
			for (int c = 0; c < array1[r].length; c++) {
				
				System.out.print(array1[r][c] + "\t");
				
			}
			System.out.println();
	
		}
		
		System.out.println();
		

		System.out.println("Employee 1 worked most hours on " + BinarySearch(array1, 1, 10) );
		System.out.println("Employee 2 worked most hours on " + BinarySearch(array1, 2, 9));
		System.out.println("Employee 1 worked most hours on " + BinarySearch(array1, 3, 8));
		System.out.println();
		addHours(array1);
		System.out.println();
		
		
		
	}
	
	static void addHours(int[][] array) {
		
		
		
		System.out.println("Employe#\t Weekly Hours");
		
		for (int r = 0; r < array.length; r++) {
			
			int sum =0;
			
			for (int c = 0; c < array[r].length; c++) {
				
				sum = sum + array[r][c];
				
			}
			
			
			
			if (r == 0) {
				System.out.println("1   \t\t     " + sum);
			}
			else if (r == 1) {
				System.out.println("2   \t\t     " + sum);
			}
			else {
				System.out.println("3   \t\t     " + sum);
			}
		}
	}
		
		public static String BinarySearch (int [][] array, int employeenumber, int target) {
			
			
			int [] array2 = new int [7];
			
			for (int count = 0; count < 7; count++) {
				
				array2[count] = array[employeenumber - 1][count];
			}
			
			int BinarySearch = 0;
			
			int low = 0;
			
			int high = array2.length;
			
			int mid = 0;
			
			
			for (int count = 0; count < array2.length; count++) {
				
				mid = (low+high)/2;
				
				if (target == array2[mid]) {
					
					BinarySearch = mid;
				}
				
				else if (target < array2[mid]) {
					
					high = mid;
				}
				
				else {
					
					low = mid;
				}
				
				
			
		}
			if (BinarySearch == 0) {
				return "Monday";
			}
			else if (BinarySearch == 1) {
				return "Tuesday";
			}
			else if (BinarySearch == 2) {
				return "Wednesday";
			}
			else if (BinarySearch == 3) {
				return "Thursday";
			}
			else if (BinarySearch == 4) {
				return "Friday";
			}
			else if (BinarySearch == 5) {
				return "Saturday";
			}
			else if (BinarySearch == 6) {
				return "Sunday";
			}
			return "";
		
		
		
		}
		
		
	}

