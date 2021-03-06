package com.samples.BFSDFS;
//DFS algorithm in Java

import java.util.*;

class DFS {
	private LinkedList<Integer>[] adjLists;
	private boolean[] visited;

// DFS creation
	DFS(int vertices) {
		System.out.println("size of vertices" + vertices);
		adjLists = new LinkedList[vertices];
		visited = new boolean[vertices];

		for (int i = 0; i < vertices; i++) {

			adjLists[i] = new LinkedList<Integer>();
			System.out.println("size of LL" + adjLists.toString() + "trtrt" + i);
		}
	}
	

	// Add edges
	void addEdges(int src, int dest) {
		adjLists[src].add(dest);
	}

	// DFS algorithm
	void DFS(int vertex) {
		visited[vertex] = true;
		System.out.print(vertex + " ");

		Iterator<Integer> ite = adjLists[vertex].listIterator();
		while (ite.hasNext()) {
			int adj = ite.next();
			if (!visited[adj])
				DFS(adj);
		}
	}

	// 0 -1
	// -2
	// 1 2

	public static void main(String args[]) {
		DFS graph = new DFS(7);

		graph.addEdges(0, 1);
		graph.addEdges(0, 2);
		graph.addEdges(1, 3);
		graph.addEdges(2, 4);
		graph.addEdges(3, 5);
		graph.addEdges(4, 6);
		graph.addEdges(5, 6);
		graph.addEdges(1, 5);
		graph.addEdges(1, 6);
		System.out.println("Following is Depth First Traversal");

		graph.DFS(2);
	}
}