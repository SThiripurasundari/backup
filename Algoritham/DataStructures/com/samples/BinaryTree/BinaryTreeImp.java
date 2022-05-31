package com.samples.BinaryTree;

import java.util.Scanner;

public class BinaryTreeImp {

	// Inner class should be static otherwise Node is not accessible from static
	// method createTree()
	static class Node {
		public int data;

		public Node(int data) {
			this.data = data;

		}

		Node left;
		Node right;

	}

	static Scanner sc = new Scanner(System.in);

	public static Node createTree() {
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();

		if (data == -1)
			return null;

		root = new Node(data);

		System.out.println("Enter left for " + data);
		root.left = createTree();

		System.out.println("Enter right for " + data);
		root.right = createTree();

		return root;
	}

	static void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.println(root.data + " ");
		inOrder(root.right);
	}

	static void preOrder(Node root) {
		if (root == null)
			return;
		System.out.println(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	static void postOrder(Node root) {
		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data + " ");
	}

	static int height(Node root) {
		if (root == null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right)) + 1;

	}

	public  int getSizeOfNode(Node root) {
		if (root == null) {
			return 0;
		} else
			return getSizeOfNode(root.left) + getSizeOfNode(root.left) + 1;

	}

	public static void main(String[] args) {
		BinaryTreeImp imp = new BinaryTreeImp();

		Node root = createTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();

		// size of Node
		int size = imp.getSizeOfNode(root);
		System.out.println("size :" + size);

	}

}
