package com.samples.practise;

import java.util.LinkedList;
import java.util.Queue;

public class GraphDSFBFS {

	LinkedList<Integer>[] list;

	GraphDSFBFS(int vertex) {
		list = new LinkedList[vertex];
		for (int t = 0; t < vertex; t++) {
			list[t] = new LinkedList<Integer>();

		}

	}

	void addEdges(int src, int dest) {
		list[src].add(dest);
		list[dest].add(src);
	}

	int BFSUtil(int src, int dest) {
		boolean[] visited = new boolean[list.length];
		return BFS(src, dest, visited);

	}

	boolean DFSUtil(int src, int dest) {
		boolean[] visited = new boolean[list.length];
		return DFS(src, dest, visited);

	}

	private boolean DFS(int src, int dest, boolean[] visited) {

		boolean isRouteThere = false;
		visited[src] = true;

		for (Integer neigh : list[src]) {

			if (src == dest) {
				return true;
			}
			if (!visited[neigh]) {
				visited[neigh] = true;
				return DFS(neigh, dest, visited);
		
			}

		}
		return isRouteThere;
	}

	private int BFS(int src, int dest, boolean[] visited) {
		int distance = 0;
		int parent[] = new int[list.length];
		parent[src] = -1;
		visited[src] = true;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(src);

		while (!q.isEmpty()) {
			int current = q.poll();

			for (Integer neigh : list[current]) {

				if (src == dest) {
					break;
				}

				while (!visited[neigh]) {
					visited[neigh] = true;
					q.add(neigh);
					parent[neigh] = current;
				}
			}
		}

		int iterateThis = dest;
		while (parent[iterateThis] != -1) {
			distance++;
			iterateThis = parent[iterateThis];
			System.out.print("  Route ->" + iterateThis + "  ");
		}

		return distance;
	}

	public static void main(String[] args) {
		GraphDSFBFS graph = new GraphDSFBFS(7);
		graph.addEdges(0, 1);
		graph.addEdges(0, 2);
		graph.addEdges(1, 3);
		graph.addEdges(2, 4);
		graph.addEdges(3, 5);
		graph.addEdges(4, 6);
		graph.addEdges(5, 6);
		graph.addEdges(1, 5);
		graph.addEdges(1, 6);

		System.out.println("Gives shortes Distance by BFS: " + graph.BFSUtil(6, 6));
		System.out.println("By DFS :" + graph.DFSUtil(0, 6));

	}

}
