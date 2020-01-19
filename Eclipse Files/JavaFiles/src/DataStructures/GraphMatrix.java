package DataStructures;

import java.util.*;

public class GraphMatrix<T> {
	
	private int [][] matrix;
	private int verticesCount;
	private HashMap<Integer, T> info;
	
	GraphMatrix(int maxVertices){
		matrix = new int [maxVertices][maxVertices];
		verticesCount = 0;
		info = new HashMap<>();			
	}
	
	void addEdge(int source, int destination) { // directed graph
		
		if(info.get(source) == null || info.get(destination) == null)
			return;
		
		matrix[source][destination] = 1;
	}
	
	void addVertex(int vertex, T description){
		
		if(verticesCount >= matrix.length) {
			return;
		}
		info.put(vertex, description);
		verticesCount++;
		
	}
	
	void print() {
		
		System.out.print("\t");
		for(int i = 0; i < matrix.length; i ++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
		for(int i = 0; i < matrix.length; i++) {
			System.out.print(i);
			for(int j = 0; j < matrix.length; j++)
				System.out.print("\t" + matrix[i][j]);
			System.out.println();
		}
	}
	
	Vector<Integer> getVertexNeighbors(int vertex) {
		
		Vector<Integer> vertexNeighbors = new Vector<>();
		for(int i = 0; i < matrix.length; i++)
			if(matrix[vertex][i] == 1)
				vertexNeighbors.add(i);
		
		return vertexNeighbors;
	}
	
	void depthFirst(int start) {
		
		if(info.get(start) == null)
			return;
		
		boolean visited [] = new boolean [matrix.length];
		
		DFSearch(start, visited);

	}
	
	void DFSearch(int start, boolean [] visited) {
		
		Vector<Integer> vertexNeighbors = getVertexNeighbors(start);
		Iterator<Integer> it = vertexNeighbors.iterator();
		
		visited[start] = true;
		
		System.out.println("Processing: " + start);
		
		while(it.hasNext()) {
				int i = it.next();
				if(!visited[i])
					DFSearch(i, visited);	
		}		
	}
	
	void BFSearch(int start) {
		
		if(info.get(start) == null)
			return;
		
		Queue<Integer> q = new LinkedList<>();
			
		boolean visited [] = new boolean [matrix.length];
		
		visited[start] = true;
		q.add(start);
		
		do {
			System.out.println("Processing: " + q.peek());
			Vector<Integer> vertexNeighbors = getVertexNeighbors(q.peek());
			Iterator<Integer> it = vertexNeighbors.iterator();
			q.remove();
			while(it.hasNext()) {
				int i = it.next();
				if(!visited[i]) {	
					visited[i] = true;
					q.add(i);
				}
					
			}	
		}
		while(!q.isEmpty());	
	}
	
	public static void main(String [] args) {
		
		GraphMatrix<String> gm = new GraphMatrix<>(9);
		
		gm.addVertex(0, "zero");
		gm.addVertex(1, "one");
		gm.addVertex(2, "two");
		gm.addVertex(3, "three");
		gm.addVertex(4, "four");
		gm.addVertex(5, "five");
		gm.addVertex(6, "six");
		gm.addVertex(7,"seven");
		gm.addVertex(8, "eight");
		
		gm.addEdge(1, 2);
		gm.addEdge(4, 1);
		gm.addEdge(2, 3);
		gm.addEdge(3, 4);
		gm.addEdge(0, 5);
		gm.addEdge(5, 4);
		gm.addEdge(6, 5);
		gm.addEdge(3, 6);
		gm.addEdge(3, 7);
		gm.addEdge(4, 2);
		gm.addEdge(1, 8);
		gm.addEdge(4, 3);
		
		gm.print();
		System.out.println();
		gm.BFSearch(0);
		
	}
	
	

}
