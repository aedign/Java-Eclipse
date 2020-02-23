package DataStructures;

public class hashTable {
	
	private int [] array;
	private int arraySize;
	private int used;
	
	hashTable(int size){
	
		arraySize = size;
		array = new int[arraySize];
		used = 0;
	}
	
	public void put(int key) { // Big O -> O(1)
		
		int hash1 = key % arraySize; // creates hash
		
		if(array[hash1] == 0) { // if the location at the hash is empty, it adds the key
			array[hash1] = key;
			used++;
		}
		else { // if the location at the hash was not free, it creates a second hash
			int hash2 = (hash1 * 2) % 100;
			// if the location at the sum of the hashes is empty or is not equal to the key,
			// then the key is added
			if (array[hash2] ==0)
				array[hash2] = key;
				used++;
		}
			
	}
	
	public void remove(int key) { // Big O -> O(1)
		
		int hash1 = key % arraySize; // creates hash
		
		if(array[hash1] == key) { // if location at the hash has the item, it is removed
			array[hash1] = 0;
			used--;
		}
		else { 
			// if key was not at the hash, it checks if it is at the sum of the two hashes
			int hash2 = hash1 % arraySize; 
			if(array[hash1 + hash2] == key) {
				array[hash1 + hash2] = 0;
				used--;
			}
		}	
	}
	
	public void search(int key) { // Big O -> O(1)
		
		int hash1 = key % arraySize;
		int hash2 = hash1 % arraySize;
		
		if(array[hash1] == key) { // if key was at hash
			System.out.println("Key " + key + " was found at index " + hash1);
			return;
		}
		else if (array[hash1 + hash2] == key) { // if key was at the sum of the hashes
				System.out.println("Key " + key + " was found at index " + hash2);
				return;
		}	
		else // key not found
			System.out.println("Key " + key + " was not found");
	}
	
	public void printTable() {
		System.out.println("Key\t\t Index\n");
		for(int i = 0; i < arraySize; i++)
			if(array[i] != 0)
				System.out.println(array[i] + "\t\t" + i);
		System.out.println();
	}
	
	public static void main(String [] args) {
		
		hashTable ht = new hashTable(100);
		
		ht.put(1);
		ht.put(5);
		ht.put(876);
		ht.put(1000);
		ht.put(12);
		ht.put(93645);
		ht.put(1222);
		ht.put(9);
		ht.put(8);
		ht.put(8);
		ht.put(99);
		ht.put(99);
		ht.put(99);
		
		ht.printTable();
		
		ht.remove(1);
		ht.remove(1222);
		ht.remove(2);
		
		ht.printTable();
		
		ht.search(93645);
		ht.search(12);
		
		

	
	}
	

}
