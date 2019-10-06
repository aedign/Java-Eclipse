package DataStructures.Queues;


public class Queue2 {
	
	class Node {
		
		int id;
		Node next;
		
		Node(int id){
			
			this.id = id;
		}

	}
	
	Node front;
	Node rear;
	
	Queue2(){
		front = null;
		rear = null;
		
	}
	
	void enqueue(int id) {
		
		Node current = new Node(id);
		
		if ( rear == null) {
			
			rear = current;
			front = current;
	
		}
		
		else {
			
			rear.next = current;
			rear = current;
		}
	}
	
	void dequeue() {
		
	
		
		if (front == null) {
			
			rear = null;
		}
		else {
			
			front = front.next;
			
		}
	}
	
	void print() {
		
		Node current = front;
		
		while (current!= null) {
			
			System.out.print(current.id + " ");
			current = current.next;
			
			
		}
	}

	public static void main(String[] args) {
	
		Queue2 qq = new Queue2();
		
		qq.enqueue(8);
		qq.enqueue(9);
		qq.enqueue(7);
		qq.dequeue();
		qq.print();
		

	}

}
