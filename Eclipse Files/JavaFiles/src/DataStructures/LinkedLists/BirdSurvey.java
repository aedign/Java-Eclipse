//Andres Di Gregorio

package DataStructures.LinkedLists;

import java.util.Scanner;

public class BirdSurvey {
	
class Node{
		
		String element;
		Node next;
		int count;
		
		public Node(String birdSpecies) {
			
			this.element = birdSpecies;
			next = null;
			count =1;
		}
		
}

	Node first;
	
		BirdSurvey(){
			
			first = new Node("");
		}

		public void Add(String birdSpecies) {
			
			Node current = first;
			
			boolean isItThere = false;
			
			while (current.next != null) {
				
			
				
					if (birdSpecies.equals(current.next.element)) {
						
						isItThere = true;
						current.next.count++;
						
					}

				
				current = current.next;
			}
			
			
			
			if (isItThere == false) {
				
				Node newNode = new Node(birdSpecies);
				current.next = newNode;
				
			}
		
			
		}
	
	public int getCount(String birdSpecies) {
		
		
		Node current = first;
		int num = 0;
		
		while (current.next != null) {
			
			if (birdSpecies.equals(current.next.element)) {
				
				num = current.next.count;
				
				break;
			}
			
			current = current.next;
		}
		
		return num;
		
	}
	
	public void getReport() {
		
		Node current = first;
		
		while (current.next != null) {
			
			System.out.println("Bird: " + current.next.element + " - Quantity: " + getCount(current.next.element));
			
			current = current.next;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		BirdSurvey survey1 = new BirdSurvey();
		
		int count= 0;
		
		while (count > 100) {
			
			String bird = scan.nextLine();
				
				if (bird.equals("done")) {
					break;
				}
			survey1.Add(bird);
			count++;
		}

		survey1.getReport();
		scan.close();
	}

}
