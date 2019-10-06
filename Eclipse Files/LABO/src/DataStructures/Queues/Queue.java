package DataStructures.Queues;

// Andres Di Gregorio

import java.util.Scanner;

public class Queue {
	
	int start, end, count, size;
	node [] array;
	
	
	class node{
		
		int calories, servings;
		String name;
		
		node (String name, int calories, int servings){
			
			this.name = name;
			this.calories = calories;
			this.servings= servings;
		}
		
	}
	

	Queue() {
		
		this.start = 0;
		this.end=0;
		this.count = 0;
		this.size = 5;
		this.array = new node[size];

		
	}
	

	
	public void enQueue(String name, int calories, int servings) {
		
		node food = new node(name ,calories,servings);
		
		this.array[end] = food;
		
		this.end = (end + 1) % this.size;
		this.count++;
		
		
		
	}
	
	public node deQueue() {
		
		node temp = this.array[start];
		
		this.start = (start + 1) % this.size;
		this.count--;
		
		return temp;
		
	}
	
	public String peek() {
		
		return this.array[start].name;
		
	}
	

	public void display() {
		
		System.out.println("Food\t\tCalories\tServings");
		
		for (int count = 0; count < size; count++) {
			
			System.out.println(array[count].name + "\t\t" + array[count].calories + "\t\t" + array[count].servings);
			
		}
	}
	
	public void averageCalories() {
		
		int avg = 0;
		int serving = 0;
		
		for (int count = 0; count < size; count++) {
			
			avg += array[count].calories;
			serving += array[count].servings;
			
		}
		
		System.out.println("Average calories per serving: " + (avg/serving));
	}
	
	public void maxCalories() {
		
		int max = 0;
		String name = "";
		
		for (int count = 0; count < size; count++) {
			
			if (array[count].calories > max) {
				
				max = array[count].calories * array[count].servings;
				name = array[count].name;
				
			}	
			
		}
		
		System.out.println("Food with the highest total calories: " + name + " has " + max + " calories");
	}
		

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		String name = "";
		int calories = 0;
		int servings = 0;

				Queue queue = new Queue();
				
				System.out.println("Enter the name of the food, amount of calories, and number of servings: ");
				
				for (int count = 0; count < 5; count++) {
					
					name = scan.nextLine();
					
					
					
					calories = scan.nextInt();
					
					servings = scan.nextInt();
					
					queue.enQueue(name, calories, servings);
					
					scan = new Scanner (System.in);
				}
					queue.display();System.out.println();
					queue.maxCalories(); System.out.println();
					queue.averageCalories();
					System.out.println();
					System.out.println(queue.peek());
					scan.close();
		}
		



	

}
