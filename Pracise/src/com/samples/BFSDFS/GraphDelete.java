package com.samples.BFSDFS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import javax.print.attribute.standard.Destination;

public class GraphDelete {

	LinkedList<Integer>[] list;

	GraphDelete(int vertex) {
		list = new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) {
			list[i] = new LinkedList<Integer>();
		}
	}

	int BFSUtil(int source, int dstination) {
		boolean[] visited = new boolean[list.length];

		return BFS(source, dstination, visited);
	}

	private int BFS(int source, int dstination, boolean[] visited) {

		visited[source] = true;
		int[] parents = new int[list.length];

		parents[source] = -1;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(source);

		while (!q.isEmpty()) {

			int current = q.poll();

			for (Integer neigh : list[current]) {

				// neigh?????????
				if (source == dstination) {
					break;
				}

				while (!visited[neigh]) {
					visited[neigh] = true;
					q.add(neigh);
					parents[neigh] = current;

				}

			}

			int distance = 0;
			int currenParent = dstination;

			while (parents[currenParent] != -1) {
				distance++;
				currenParent = parents[currenParent];

			}

		}

		visited[source] = true;
		int parent[] = new int[list.length];
		parent[source] = -1;
		Queue<Integer> que = new LinkedList<Integer>();

		que.add(source);

		while (!que.isEmpty()) {
			int current = que.poll();
			System.out.print(current + " ");
			for (int neighbour : list[current]) {

				if (neighbour == dstination) {
					break;
				}

				if (!visited[neighbour]) {
					visited[neighbour] = true;
					que.add(neighbour);
					parent[neighbour] = current;
				}

			}

		}

		int distance = 0;
		int parentCurrent = dstination;

		while (!(parent[parentCurrent] == -1)) {
			distance++;
			parentCurrent = parent[parentCurrent];

		}

		return distance;

	}

	void addEdges(int src, int dest) {
		list[src].add(dest);
		list[dest].add(src);

	}

	// check if their is any route available between them
	public boolean DFS(int source, int destination, boolean[] visited) {

		visited[source] = true;
		System.out.print(source + " ");

		if (source == destination) {
			return true;

		}

		Iterator<Integer> iterator = list[source].iterator();
		while (iterator.hasNext()) {

			int neigh = iterator.next();
			if (!visited[neigh]) {
				if (DFS(neigh, destination, visited))
					return true;
			}
		}

		return false;

	}

	public boolean dfsUtil(int source, int destination) {
		boolean vis[] = new boolean[list.length];
		vis[source] = true;
		return DFS(source, destination, vis);
	}

	public static void main(String[] args) {

		GraphDelete graph = new GraphDelete(7);
		graph.addEdges(0, 1);
		graph.addEdges(0, 2);
		graph.addEdges(1, 3);
		graph.addEdges(2, 4);
		graph.addEdges(3, 5);
		graph.addEdges(4, 6);
		graph.addEdges(5, 6);
		graph.addEdges(1, 5);
		graph.addEdges(1, 6);

		System.out.println("Gives shortes Distance by BFS: " + graph.BFSUtil(0, 6));

		System.out.println("By DFS :" + graph.dfsUtil(0, 10));

	}

}
