// Graphs
// DFS 
// BFS Traversal
// BFS-> Maintaing a queue for the traversal of all adj nodes 

import java.util.*;
class Tree {
	static ArrayList<ArrayList<Integer>> adjL;
	public Tree (int V) {   // makes a tree of V vertices
		adjL = new ArrayList<ArrayList<Integer>>(V);
		for (int i = 0; i < V; i++) {
			adjL.add(new ArrayList<Integer>());
		}
	}
	public void DFSTraversal (ArrayList<ArrayList<Integer>> adjL, int source, boolean[] visited) {
		if (!visited[source]) {
			// node is not yet visited
			System.out.print(source+" ");
			visited[source] = true;
			//visit the node
			//visit all its adjacents reccursive manner
			for (int u : adjL.get(source)) {
				DFSTraversal(adjL, u, visited);
			}
		}
	}
	public void BFSTraversal (ArrayList<ArrayList<Integer>> adjL, int source) {
		// make a queue for storing the elements 
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[adjL.size()];
		for (int i = 0; i < adjL.size(); i++) visited[i] = false;
		q.add(source); // [0]
		visited[source] = true;
 		while (!q.isEmpty()) { // 1 2 
			int x = q.remove(); // removed the element x-> 1
			//                  visited->[true, true, false, false, false] 
			System.out.print(x + " "); // 		   0 1			
			// go traverse the adjacednts of the x
			for (int u : adjL.get(x)) { 	//     
				if (!visited[u])
				{
					visited[u] = true;
					q.add(u);				// q[1,2]
					
				}
			}
 		}
	}
	public void addEdge (int u, int v) {
		adjL.get(u).add(v);
	}
	public static void main(String[] args) {
		int V = 5;
		Tree t = new Tree(V);
		t.addEdge(0, 1);
		t.addEdge(1, 0);
		t.addEdge(0, 2);
		t.addEdge(2, 0);
		t.addEdge(1, 3);
		t.addEdge(1, 4);
		t.addEdge(4, 1);
		t.addEdge(3, 1);
		t.addEdge(4, 2);
		t.addEdge(2, 4);

		/*
					  0
					 / \
				    1   2
				   / \
				  3---4

		*/
		boolean []visited = new boolean[V];
		for (int x = 0; x < V; x++) visited[x] = false;
		System.out.println("DFS Traversal = ");
	    t.DFSTraversal(adjL, 0, visited);

		System.out.println("\nBFS Traversal = ");
		t.BFSTraversal(adjL, 0);
	}
}

