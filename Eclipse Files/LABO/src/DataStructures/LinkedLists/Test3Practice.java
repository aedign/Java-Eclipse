package DataStructures.LinkedLists;


import java.util.*;

public class Test3Practice {
	
	class Node{
		
		int id;
		Node next;
		Node prev;
		
		Node (int id){
			
			this.id = id;
			this.next = null;
			this.prev = null;
		}
	}
	
	Node first;
/*	Node last;
	
	Test3Practice(){
		
		first = null;
		last = null;
	}
	
	public void prepend(int id) {
		
		Node current = new Node (id);
		
		if (first != null) {
			
			first.prev = current;
		}
		
		first = current;
		
		if (last == null) {
			
			last = current;
		}
		
	}
	
	public void append(int id) {
		
		Node current = new Node (id);
			
			if (last != null) {
				
				last.next = current;
			}
			
			last = current;
			
			if (first == null) {
				
				first = current;
			}
			
	}
	
	public void print() {
		
		Node current = first;
		
		while (current != null) {
			
			System.out.print(current.id + " ");
			current = current.next;
	
		}
		
	}
	
	public void print2() {
		
		Node current = last;
		
		while (current != null) {
			
			System.out.print(current.id + " ");
			current = current.prev;
	
		}
		
		
	}
	
	public void removefirst() {
		
		first = first.next;
		first.prev = null;
	}
	
	public void removelast() {
		
		last = last.prev;
		last.next = null;
	}
*/	
	public void Add(int id) {
		
		Node current = first;
		
		if (first == null) {
			
			Node newNode = new Node(id);
			first = newNode;
			return;
		}
		
		while (current.next != null) {
			
			current = current.next;
			
		}
		
		Node newNode = new Node(id);
		current.next = newNode;
	
	}
	
	void removeFirst() {
		
	first = first.next;
		
		
		
	}
	
	void removeLast() {
		
		Node current = first;
		
		while (current.next != null) {
			
			current = current.next;
		}
		
		
		current.id = -99;
	}
	
	public void print() {
		
		Node current = first;
		
		while (current != null && current.id != -99) {
			
			System.out.print(current.id + " ");
			current = current.next;
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Test3Practice test = new Test3Practice();
		
		
		test.Add(8);
		test.Add(9);
		test.print();
		test.removeFirst();
		System.out.println();
		test.print();

		
	//	test.removelast();
		System.out.println();
	//	test.print2();
		scan.close();
		
	}

}
