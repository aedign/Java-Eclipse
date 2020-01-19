package DataStructures;

// Andres Di Gregorio

import java.util.Scanner;

public class DataStructureStack {
	
	Node top;
	int size;
	
	DataStructureStack(){
		
	}
	
	class Node {
		
		Node next;
		int data;
		
		Node(){
			top = new Node();
		}
		
		Node (int data){
			this.data = data;
		}
		
	}
	
	public void push(int data) { // Big O -> O(1)
		
		Node node = new Node(data);
		
		if (isEmpty()) {
			top = node;
			size++;
		}
		else {
			node.next = top;
			top = node;
			size++;
		}
	}
	
	public void pop() { // Big O -> O(1)
		
		if (isEmpty())
			return;
		else {
			top = top.next;
			size--;
		}
	}
	
	public boolean isEmpty() {
		return (top==null);
	}
	
	public void search(int target) { // Big O -> O(n)
		
		for (Node temp = top; temp!= null; temp = temp.next) {
			if (temp.data == target) {
				System.out.println("Target " + target + " was found");
				return;
			}
		}		
		System.out.println("Target " + target + " was not found");
	}
	
	public void insert(int data) { // Big O -> O(1)
		top.data = data;
	}

	
	public void display() {
		
		System.out.println();
		for(Node temp = top; temp != null; temp = temp.next)
			System.out.print(temp.data + " ");
	
	}
	
	public void getSize() {
		System.out.println("Size: " + size);
	}
	
	public static void main(String[] args) {
		
		DataStructureStack stack1 = new DataStructureStack();
		
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		stack1.push(6);
		
		stack1.display();
		
		stack1.pop();
		stack1.pop();
		
		System.out.println();
		
		stack1.display();
		
		System.out.println();
		
		stack1.search(2);
		stack1.search(1);
		stack1.search(9999);
		
		stack1.insert(888);
		
		stack1.display();
		
		System.out.println();
		
		stack1.getSize();
		
		
	}
}