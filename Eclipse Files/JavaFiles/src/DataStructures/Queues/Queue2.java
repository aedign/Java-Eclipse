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
	
	// adds node with the id passed as the parameter to the end on the queue
	void enqueue(int id) { //  Big O -> O(1)
		Node current = new Node(id);
		if ( rear == null) { // if the queue is empty, the rear and front are equal to the new node
			rear = current;
			front = current;
		}
		else { // if the queue is not empty, then the new node is added to the rear
			rear.next = current;
			rear = current;
		}
	}
	
	// it removes the node located at the front
	void dequeue() { // //  Big O -> O(1)
		if (front == null) { // if the front is null, the rear is set as null too.
			rear = null;     // Therefore having an empty queue
		}
		else {
			front = front.next; // if the queue is not empty, the front is removed.
		}
	}
	
	public void search(int target){ // Big O -> O(n)
		System.out.println();
		int position = 0; // keeps track of where the target node is
		for(Node temp = front; temp != null; temp = temp.next){ // loops through queue to find the node
			if(temp.id == target){
				System.out.println(target + " was found at position " + position);
				return; // node was found and method ends
			}
			position++;
		}
		System.out.println(target + " was not found"); // printed if node was not found
}
	
	void print() {
		
		Node current = front;
		
		while (current!= null) {
			
			System.out.print(current.id + " ");
			current = current.next;
			
			
		}
	}
	
void insert(int data, int position) { // Big O -> O(n)
	    
	    Node newNode = new Node(data); 
	    
	    //Empty queue. Returned newly created node or null
	    if (front==null){
	    	front = newNode;
	    	return;
	    	}
	    
	    //Inserting a Node before front
	    if (position == 0){
	    	newNode.next = front;
	    	front = newNode;
	    	return;
	    	}    

	    Node toIterate =  new Node(data);
	    toIterate = front; // A node equal to the front is created in order to find the new 
	    					//position without changing the queue's actual front
	    
	    for (int currPosition = 0; currPosition < position -1 && toIterate.next != null; toIterate = toIterate.next){       
	        currPosition++;       
	    }

	    //Inserting a Node in-between or at the end of the queue
	    newNode.next = toIterate.next;
	    toIterate.next = newNode;
	        
	}

	public static void main(String[] args) {
	
		Queue2 qq = new Queue2();
		
		qq.enqueue(1);
		qq.enqueue(2);
		qq.enqueue(3);
		qq.enqueue(4);
		qq.enqueue(5);
		qq.enqueue(6);
		
		qq.dequeue();
		qq.print();
		
		System.out.println();
		qq.insert(1111, 3);
		System.out.println();
		qq.print();
		qq.search(2);
		

	}

}
