package delete;

import java.util.LinkedList;
import java.util.ListIterator;

public class DFSDelete {

	LinkedList<Integer> list[];
	boolean visited[];

	public DFSDelete(int vertics) {

		list = new LinkedList[vertics];
		visited = new boolean[vertics];

		for (int i = 0; i < vertics; i++) {

			list[i] = new LinkedList();

		}

	}

	void DFS(int vertics) {

		visited[vertics] = true;
		System.out.print(vertics + " ");

		ListIterator<Integer> iterator = list[vertics].listIterator();

		while (iterator.hasNext()) {

			int dis = iterator.next();

			if (!visited[dis]) {
				DFS(dis);

			}

		}

	}

	public static void main(String[] args) {

		DFSDelete g = new DFSDelete(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal");

		g.DFS(2);

	}

	private void addEdge(int i, int j) {
		list[i].add(j);

	}

}
