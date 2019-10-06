package FileReading;

import java.io.*;
import java.util.*;

public class Files {
	
	private static Scanner filescanner;
	private File copy;
	private static String text;
	
	void OpenFile(String filename) {
		
		try {
			
			filescanner = new Scanner(new File(filename));
			
			
		} catch (Exception e) {

			System.out.println("File not found ");
		}

		
	}
	
	void readFile() {
		
		
		while(filescanner.hasNext()) {
			
			text += filescanner.next() + " ";
			
		}
		
}
	
	void copyFile(String name) {
		
		this.copy = new File(name);
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	
		
		FileOutputStream fs;
		
			if (copy.exists()) {
				
				System.out.println("\nCopy already exists. Do you wish to overwrite the file or change file name?");	
				System.out.println("Press \"o\" to overwrite or \"c\" to change the file name");
				
				String decision = scan.nextLine();
				
				
				if (decision.equals("o")) {
					
					try {
						fs = new FileOutputStream(name);
						PrintWriter pw = new PrintWriter(fs);
						pw.println(text);
						pw.close();
						System.out.println("Copy was created");
					} catch (FileNotFoundException e) {
				
						System.out.println("Error overwriting file");
					}
						
				}
				
				if (decision.equals("c")) {
					
					System.out.println("Enter name:");
					name = scan.next();
					this.copy = new File(name);
					
					while (copy.exists()) {
						
						System.out.println("File exists. Choose a different name or press \"0\" to end.");
						name = scan.next();
						if (name.equals("0")) {
							System.out.println("Program ended.");
							return;
						}
						else {
							this.copy = new File(name);	
						}
						
						
					}
					
					try {
						fs = new FileOutputStream(name);
						PrintWriter pw = new PrintWriter(fs);
						pw.println(text);
						pw.close();
						System.out.println("Copy was created");
					} catch (FileNotFoundException e) {
				
						System.out.println("Error changing file");
					}
	
				}

			}
			
			else {
			
			try {
							
				fs = new FileOutputStream(name);
				PrintWriter pw = new PrintWriter(fs);
				pw.println(text);
				pw.close();
				System.out.println("Copy was created");
		
			}
			
			catch (Exception e) {
				
				
				System.out.println("File could not be created");
			}
			
			
			}	
		
				filescanner.close();

			
		}
	
		
			


	public static void main(String[] args) {

		Files files = new Files();
		
		System.out.println("Enter name of text file to find: ");
		Scanner scan = new Scanner (System.in);
		String name = scan.nextLine();

		
		files.OpenFile(name);
		files.readFile();
		
		System.out.println("Enter name of the copy to be created: ");
		String name2 = scan.nextLine();
		
		files.copyFile(name2);
		scan.close();
		

	}

}
