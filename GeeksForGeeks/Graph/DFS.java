import java.util.*;
class DFS {
	static int V = 0;
	static ArrayList<ArrayList<Integer>> adjL;
	public DFS(int V) {
		this.V = V;
		adjL = new ArrayList<ArrayList<Integer>>(V);
		for (int i = 0; i < V; i++) {
			adjL.add(new ArrayList<Integer>());
		}
	}
	public static void dfsUtil(int start, boolean []vis) {
		// mark it as visited
		vis[start] = true;
		System.out.print(start + " ");
		for (int v : adjL.get(start)) {
			if (!vis[v]) {
				dfsUtil(v, vis);
			}
		}
	}
	public static void dfs() {
		boolean []vis = new boolean[V];
		for (int i = 0; i < V; i++) {
			if (!vis[i]) {
				dfsUtil(i, vis);
			}
		}
	}
	public static void main(String[] args) {
		int size = 5;
		DFS my = new DFS(size);
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
		my.dfs();
	}
}