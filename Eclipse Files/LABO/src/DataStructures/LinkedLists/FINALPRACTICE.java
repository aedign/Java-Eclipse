package DataStructures.LinkedLists;

public class FINALPRACTICE{
	
	class Node {
		
		int num;
		Node next;
		
		Node(){
			
		}
		
		Node(int num){
			
			this.num = num;
			this.next = null;
		}
	
	}
	
	Node first;
	
	FINALPRACTICE(){
		
		first = new Node();
	}
	
	
	void add(int num) {
	
			
			Node current = first;
		
			while (current.next != null) {
				
				current = current.next;
			
			}
			
			Node newNode = new Node(num);
		
			current.next = newNode;
			
		}

	
	void OneTwoThree() {
		
		first.next = new Node(1);
		first.next.next = new Node(2);
		first.next.next.next = new Node(3);
		
		
	}
	
	void print() {
		
		Node current = first;
		
		while(current.next != null) {
			
			System.out.println(current.next.num);
			
			current = current.next;
		}
		
	}
	
	//public override Boll
	
	public static void main(String[] args) {
		
		FINALPRACTICE aa = new FINALPRACTICE();
		
		aa.add(2);
		aa.add(5);
		aa.add(6);
		aa.add(8);
		aa.print();
		
		FINALPRACTICE bb = new FINALPRACTICE();
		bb.OneTwoThree();
		bb.print();
		
		
		
		
		
	}


}



	
