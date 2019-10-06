package DataStructures;

// Andres Di Gregorio

import java.util.Scanner;

public class Stacks {
	
	Node top;
	
	Stacks(){
		
	}
	
	class Node {
		
		Node next;
		String name;
		String color;
		String washable;
		
		Node(){
			
		top = new Node();
			
		}
		
		Node (String name, String color, String washable){
			
			this.name = name;
			this.color =color;
			this.washable = washable;
		}
		
	}
	
	public void push(String name, String color, String washable) {
		
		Node node = new Node(name, color, washable);
		
		if (top == null) {
			top = node;
		}
		else {
			node.next = top;
			top = node;
		}
	}
	
	public void pop() {
		
		if (top == null) {
			return;
		}
		
		else {
			top = top.next;
		}
	}
	
	public boolean isEmpty() {
		return (top==null);
	}
	
	public void sameColor(String color) {
		
		Node node = top;
		int count = 0;
		
		while (node != null) {
			
			if (node.color.equals(color)) {
			
			count ++;
			
			}
			
			node = node.next;
		}
		
		System.out.println("There are " + count + " " + color + " items");
	}
	
	public void sameWashable() {
		
		Node node = top;
		int count = 0;
		
		while (node != null) {
			
			if (node.washable.equals("yes")) {
			
			count ++;
			
			}
			
			node = node.next;
		}
		
		System.out.println("There are " + count + " washable items");
	}

	
	public void peek() {
		
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Top is: " + top);
		}
	}
	
	public void display() {
		
		Node node = top;
		int count = 1;
		
		while (node != null) {
			
			System.out.println("Item " + count + ": " + "Name: " + node.name + " | Color:" +  node.color + " | Washable in high temp.?: " + node.washable);
			
			 node = node.next;
			 count++;
			
		}
	
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		Stacks theStack = new Stacks();
		
		
		System.out.println("Enter the name, color, and if item is washable (yes or no):");
		for (int count =0; count < 3; count++) {
			
			String name = scan.nextLine();
			String color = scan.nextLine();
			String washable = scan.nextLine();
			
			theStack.push(name, color, washable);
		
		}
			theStack.display();
			System.out.println();
			theStack.sameColor("blue");
			System.out.println();
			theStack.sameWashable();
			theStack.pop();
			theStack.display();
			scan.close();
}
	
}
