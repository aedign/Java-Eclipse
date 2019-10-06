package DataStructures.LinkedLists;

//Andres Di Gregorio



import java.util.Scanner;



public class LinkedList {
	
	class Node{
		
		int element;
		Node next;
		
		public Node(int elementInformation) {
			
			this.element = elementInformation;
		
			
			
		}
		

		/* public void changeNext (Node next) {
			
			this.next = next;
		}
		
	*/ }
	
	Node first;
	
	LinkedList(){
		
		first = new Node(0);
		
	}

	
	public void add(int num){
		
		Node current = first;
		boolean aa = false;
		
		
		while(current.next != null) {
			
			if (current.next.element == num) {
			
				aa = true;
				
			}
			
			current = current.next;
			
			
		}
			 
		if (aa == false) {
			
			Node newNode = new Node(num);
			
			current.next = newNode;
			
		}
		else {
			Node newNode = new Node(0);
			
			current.next = newNode;
			
		}
	
			
		
		
		
	}
	
	public int getElementIndex(int index) {
		
		int currentIndex = 0;
		Node current = first;
		
		while(currentIndex <= index) {
			
			currentIndex++;
			current = current.next;
		}
		
		return current.element;
	}
	
	public void remove() {
		
		first = first.next;
	}
	
	public void print() {
		
		Node current = first;
		
		while (current.next != null) {
			
			System.out.println(current.next.element + " ");
			current = current.next;
		}
	}
	public void findById(int id){

		Node current = first;

		while (current.next.element != id){

			if (current.next == null){

				System.out.println("not found");

				break;

			}

		else {

		current = current.next;

		}

		}
		
		System.out.println("Location is: " + current.next);
	}

	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insert the length of the Linked list:");
		int length = scan.nextInt();
		
		System.out.println("Enter the values of the Linked list:");
		
		LinkedList list1 = new LinkedList();
		
		int sum =0;
		
		for (int count= 0; count < length; count++) {
			
			list1.add(scan.nextInt());
			sum += list1.getElementIndex(count);
			
		}
		

		System.out.println("Sum of values in the list: " + sum);
		list1.print();		
		scan.close();
	}
	
	

}
