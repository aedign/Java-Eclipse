package DataStructures.LinkedLists;



class DoublyLinkedList {
	
class Node{
		
		int data;
		Node next;
		Node prev;
		
		Node (int data){
			
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public DoublyLinkedList() {
		head = null;  // null head initialization
		tail = null;  // null head initialization
		size = 0;
	}

	public int size() { 
		return size; 
	}

	public boolean isEmpty() { 
		return (size == 0); 
	}

	/**
	 * adds element at the end of the linked list
	 */
	public void add(int data) { // Big O -> O(1)

		Node temp = new Node(data);
		if(tail != null) { // if there is a tail, it adds after the tail.
			tail.next = temp;
			temp.prev = tail;
			}
		tail = temp; // the added node is the new tail, regardless of 
					//whether the list was empty or not
		if(head == null) { // if there is no head, the new node is the new head as well
			head = temp;
			}
		size++; 
	}

	/**
	 * displays all nodes of the linked list
	 */
	public void printForward(){
		
		if(isEmpty())
			return;
		
		Node theNode = head;

		while(theNode != null){
			System.out.print(theNode.data + " ");
			theNode = theNode.next;
		}
		System.out.println();

	}
	
	public void printBackwards(){
		
		if(isEmpty())
			return;
		
		Node theNode = tail;

		while(theNode != null){
			System.out.print(theNode.data + " ");
			theNode = theNode.prev;
		}
		System.out.println();

	}


	public void remove(int data) { // Big O -> O(n)
	
		Node temp = head;
		
		if(head.data == data) { // deletes the node if it is in the head
			head = head.next;
			head.prev = null;
			return;
		}
		
		while(temp != null){ // finds the node and removes if its 
										//in the middle or end of the list
			if(temp.next.data == data) {
				temp.next = temp.next.next;
				temp.next.prev = temp;
				break;
			}
			temp = temp.next;
		}
	}
	
	void insert(int data, int position) { // Big O -> O(n)
	    
	    Node newNode = new Node(data); 
	    
	    //Empty List - Returned newly created node or null
	    if (head==null){
	    	head = newNode;
	    	return;
	    	}
	    
	    //Inserting a Node before the head of the List
	    if (position == 0){
	    	newNode.next = head;
	    	head.prev = newNode;
	    	head = newNode;
	    	return;
	    	}    


	    Node toIterate =  new Node(data);
	    toIterate = head; // A node equal to the head is created in order to find the new 
	    					//position without changing the head
	    
	    for (int currPosition = 0; currPosition < position -1 && toIterate.next != null; toIterate = toIterate.next){       
	        currPosition++;       
	    }

	    //Inserting a Node in-between a List or at the end of of a List
	    newNode.next = toIterate.next;
	    toIterate.next.prev = newNode;
	    newNode.prev = toIterate;
	    toIterate.next = newNode;
	        
	}
	
	public void search(int target){ // Big O -> O(n)
		
		int position = 0;
		for(Node temp = head; temp != null; temp = temp.next){ // loops through list to find the node
			if(temp.data == target){
				System.out.println(target + " was found at position " + position);
				return;
			}
			position++;
		}
		System.out.println(target + " was not found"); // printed if node was not found
}
	
	public void reverse() {
		
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;
		printForward();
	}

	public static void main(String[] args){

		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.add(1);
		dll.add(2);
		dll.add(3);
		dll.add(4);
		dll.add(5);
		dll.printBackwards();
		dll.insert(9, 3);
		dll.printBackwards();
		
		dll.printForward();

		dll.remove(2);
		
		
		dll.printForward();
		
		dll.search(99);
		dll.search(5);
		
		dll.remove(1);
		dll.size();
		dll.printForward();
		
		dll.reverse();


	}
}