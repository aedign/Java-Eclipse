package DataStructures.LinkedLists;



class DoublyLinkedList {
	
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
	 * adds element at the front of the linked list
	 */
	public void prepend(int id, String name) {
		Node tmp = new Node(id);
		if(head != null ) {head.prev = tmp;}
		head = tmp;
		if(tail == null) { tail = tmp;}
		size++;
		System.out.println("prepending id: "+ id + " name: " + name);
	}

	/**
	 * adds element at the end of the linked list
	 */
	public void append(int id, String name) {

		Node tmp = new Node(id);
		if(tail != null) {tail.next = tmp;}
		tail = tmp;
		if(head == null) { head = tmp;}
		size++;
		System.out.println("appending id: "+ id + " name: " + name);
	}

	/**
	 * displays all nodes of the linked list
	 */
	public void displayAllNodes(){
		Node theNode = head;
		// Start at the reference stored in head and
		// keep getting the references stored in next for
		// every Link until next returns null

		System.out.println("Displaying all nodes ..... ");

		while(theNode != null){
		
			System.out.println("Previous node: " + theNode.prev + "\t Next node: " + theNode.next);
			theNode = theNode.next;
			System.out.println();
		}

	}


	/**
	 * this method walks forward through the linked list
	 */
	public void iterateForward(){

		System.out.println("Iterating forward.....");
		Node tmp = head;
		while(tmp != null){
			//            System.out.println(tmp.element);
			System.out.println("iterateForward id: "+ tmp.id);
			tmp = tmp.next;
		}
	}

	/**
	 * this method walks backward through the linked list
	 */
	public void iterateBackward(){

		System.out.println("Iterating backword.....");
		Node tmp = tail;
		while(tmp != null){
			//            System.out.println(tmp.element);
			System.out.println("iterateBackward id: "+ tmp.id );
			tmp = tmp.prev;
		}
	}

	/**
	 * this method removes element from the start of the linked list
	 */
	public void removeFirst() {
		
		Node tmp = head;
		head = head.next;
		head.prev = null;
		size--;
		System.out.println("removeFirst id: "+ tmp.id );

	}

	/**
	 * this method removes element from the end of the linked list
	 * @return
	 */
	public void removeLast() {
	
		Node tmp = tail;
		tail = tail.prev;
		tail.next = null;
		size--;
		System.out.println("removeFirst id: "+ tmp.id );

	}



	public static void main(String[] args){

		DoublyLinkedList dll = new DoublyLinkedList();
		System.out.println(dll.size());
		
		dll.append(1, "A");
		dll.append(2, "B");
		dll.prepend(3, "C");
		dll.append(4, "D");
		dll.append(5, "E");

		dll.displayAllNodes();

		dll.iterateForward();
		dll.removeFirst();
		dll.removeLast();
		dll.iterateBackward();
	}
}