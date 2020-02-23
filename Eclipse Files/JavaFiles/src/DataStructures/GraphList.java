package DataStructures;

import java.util.*;

class Vertex<T, F> {
	 
	 private T id;
	 private F info;
	 
	 Vertex(T id, F info){
		 
		 this.id = id;
		 this.info = info;
	 }
	 
	T getID() {
		 return this.id;
	 }
	 
	 F getInfo() {
		 return this.info;
	 }
}

public class GraphList<T,F> {

	private Map<Vertex<T,F>, List<Vertex<T,F>>> graphMap;
	private int verticesCount;
	
	GraphList(){
		graphMap = new LinkedHashMap<>();
		verticesCount = 0;
	}
	
	public void addEdge(Vertex<T,F> source, Vertex<T,F> destination) { // directed graph
			
		if(!graphMap.containsKey(source) || !graphMap.containsKey(destination))
			return;
		
		graphMap.get(source).add(destination);
	}
	
	public void removeEdge(Vertex<T,F> source, Vertex<T,F> destination) {
		
		if(!graphMap.containsKey(source) || !graphMap.containsKey(destination))
			return;
		
		graphMap.get(source).remove(destination);
	}
	
	public void addVertex(Vertex<T,F> v){
		
		graphMap.putIfAbsent(v, new LinkedList<Vertex<T,F>>());
		verticesCount++;
	}
	
	public void removeVertex(Vertex<T,F> v){
		
		if(!graphMap.containsKey(v))
			return;
		
		graphMap.values().stream().forEach(list -> list.remove(v));
		graphMap.remove(v);
		verticesCount--;
	}
	
	private String toString(List<Vertex<T,F>> list) {
		
		String result = "[";
		
		for(Vertex<T, F> v : list)
			result += v.getID() + ", ";
		
		if(result.substring(0, result.length()).length() > 1)
			result = result.substring(0, result.length()-2);
			
		return result + "]";
	}
	
	void printAllVertices() {	
		
		for(Vertex<T,F> v : graphMap.keySet())
			System.out.println("Vertex: " + v.getID() + "\tInfo: " + v.getInfo() + 
					"\tEdges: " + toString(graphMap.get(v)));
	}
	
	private List<Vertex<T,F>> getVertexNeighbors(Vertex<T,F> v) {
		
		if(!graphMap.containsKey(v))
			return null;
		
		return graphMap.get(v);
	}
	
	public void depthFirst(Vertex<T,F> start) {
		
		if(!graphMap.containsKey(start))
			return;
		
		Map<Vertex<T,F>, Boolean> visited = new HashMap<>();
		
		System.out.println("Depth First Search:\n");
		
		for(Vertex<T,F> v: graphMap.keySet())
			visited.put(v, false);
		
		DFSearch(start, visited);
	}
	
	void DFSearch(Vertex<T,F> start, Map<Vertex<T,F>, Boolean> visited) {
		
		List<Vertex<T,F>> vertexNeighbors = getVertexNeighbors(start);
		Iterator<Vertex<T,F>> it = vertexNeighbors.iterator();
		
		visited.replace(start, true);
		
		System.out.println("Processing: " + start.getID() + " - Info: " + start.getInfo());
		
		while(it.hasNext()) {
				Vertex<T,F> i = it.next();
					if(!visited.get(i))
						DFSearch(i, visited);	
		}		
	}
	
	void BFSearch(Vertex<T,F> start) {
		
		if(!graphMap.containsKey(start))
			return;
		
		System.out.println("Breadth First Search:\n");
		
		Queue<Vertex<T,F>> q = new LinkedList<>();
			
		Map<Vertex<T,F>, Boolean> visited = new HashMap<>();
		
		for(Vertex<T,F> v: graphMap.keySet())
			visited.put(v, false);
		
		visited.replace(start, true);
		q.add(start);
		
		do {
			System.out.println("Processing: " + q.peek().getID() + " - Info: " + q.peek().getInfo());
			List<Vertex<T,F>> vertexNeighbors = getVertexNeighbors(q.peek());
			Iterator<Vertex<T,F>> it = vertexNeighbors.iterator();
			q.remove();
			while(it.hasNext()) {
				Vertex<T,F> i = it.next();
					if(!visited.get(i))	{
						visited.replace(i, true);
						q.add(i);
					}
				}	
		}
		while(!q.isEmpty());	
	}
	
	public static void main(String [] args) {
		
		GraphList<Integer, String> gm = new GraphList<>();
		
		Vertex<Integer, String> v1 = new Vertex<Integer, String>(1, "one");
		Vertex<Integer, String> v2 = new Vertex<Integer, String>(2, "two");
		Vertex<Integer, String> v3 = new Vertex<Integer, String>(3, "three");
		Vertex<Integer, String> v4 = new Vertex<Integer, String>(4, "four");
		Vertex<Integer, String> v5 = new Vertex<Integer, String>(5, "five");
		Vertex<Integer, String> v6 = new Vertex<Integer, String>(6, "six");
		Vertex<Integer, String> v7 = new Vertex<Integer, String>(7, "seven");
		
		gm.addVertex(v1);
		gm.addVertex(v2);
		gm.addVertex(v3);
		gm.addVertex(v4);
		gm.addVertex(v5);
		gm.addVertex(v6);
		gm.addVertex(v7);
		gm.addEdge(v1, v2);
		gm.addEdge(v2, v3);
		gm.addEdge(v3, v4);
		gm.addEdge(v4, v5);
		gm.addEdge(v1, v5);
		gm.addEdge(v2, v4);
		gm.addEdge(v5, v1);
		gm.printAllVertices();
		System.out.println();
		//gm.removeVertex(v1);
		gm.addEdge(v5, v2);
		gm.depthFirst(v4);
		gm.addVertex(v1);
		gm.addEdge(v1, v5);
		gm.addEdge(v5, v1);
		gm.addEdge(v3, v6);
		gm.addEdge(v3, v7);
		System.out.println();
		gm.BFSearch(v4);
		
		
	}
	

}
