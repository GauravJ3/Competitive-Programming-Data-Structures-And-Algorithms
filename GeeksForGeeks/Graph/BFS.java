import java.util.*;
class BFS {
	static int V;
	static ArrayList<ArrayList<Integer>> adjL;
	public BFS(int v) {
		V = v;
		adjL = new ArrayList<ArrayList<Integer>>(V);
		for (int i = 0; i < V; i++) {
			adjL.add(new ArrayList<Integer>());
		}
	}
	public static void bfsUtil(int start, boolean []vis) {
		// make a Queue for storing the elements in same range
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		// every elemnet that goes into the queue will be marked as visited
		vis[start] = true;
		while (!q.isEmpty()) {
			int u = q.remove(); // remove the element of queue
			System.out.print(u+" ");
			for (int v : adjL.get(u)) {
				// for every adjacent 
				if (!vis[v])
				{
					q.add(v);
					vis[v] = true;
				}
			}
		}
	}
	public static void bfs() {
		boolean []vis = new boolean[V];
		for (int i = 0; i < V; i++) {
			if (!vis[i]) {
				bfsUtil(i, vis);
			}
		}
	}
	public static void main(String[] args) {
		int size = 5;
		BFS my = new BFS(size);
		adjL.get(0).add(1);
		adjL.get(0).add(2);
		adjL.get(1).add(0);
		adjL.get(1).add(4);
		adjL.get(2).add(0);
		adjL.get(1).add(3);
		adjL.get(4).add(3);
		adjL.get(3).add(4);
		adjL.get(3).add(1);
		adjL.get(4).add(1);
		my.bfs();
	}
}