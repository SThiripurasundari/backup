package delete;

import java.util.LinkedList;
import java.util.Queue;

public class BFSDelete {

	LinkedList<Integer> list[];
	// boolean[] visited;

	BFSDelete(int vertex) {

		list = new LinkedList[vertex];
		// visited = new boolean[vertex];

		for (int t = 0; t < vertex; t++) {
			list[t] = new LinkedList<Integer>();
		}

	}

	int BFS(int src, int dis) {
		boolean visited[] = new boolean[list.length];
		int parent[] = new int[list.length];
		int distance = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(src);
		parent[src] = -1;
		visited[src] = true;

		while (!queue.isEmpty()) {
			int current = queue.poll();
			if (current == dis)
				break;

			for (int neighbour : list[current]) {
				if (!visited[neighbour]) {
					visited[neighbour] = true;
					queue.add(neighbour);
					parent[neighbour] = current;
				}
			}

		}

		int cur = dis;

		while (parent[cur] != -1) {
			System.out.println(cur + "-->");
			cur = parent[cur];
			distance++;

		}
		return distance;

	}

	// Add edges to the graph
	void addEdge(int v, int w) {
		list[v].add(w);
		list[w].add(v);
	}

	public static void main(String[] args) {
		BFSDelete g = new BFSDelete(5);

		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(4, 2);
		g.addEdge(2, 3);
		g.addEdge(4, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		System.out.println("Distance :" + g.BFS(0, 3));

	}

}
