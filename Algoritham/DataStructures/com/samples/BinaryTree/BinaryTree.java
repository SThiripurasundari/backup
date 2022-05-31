package com.samples.BinaryTree;
//Tree traversal in Java

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int item;
	Node left, right;

	public Node(int key) {
		item = key;
		left = right = null;
	}
}

class BinaryTree {
// Root of Binary Tree
	Node root;

	BinaryTree() {
		root = null;
	}

	void postorder(Node node) {
		if (node == null)
			return;

		// Traverse left
		postorder(node.left);
		// Traverse right
		postorder(node.right);
		// Traverse root
		System.out.print(node.item + "->");
	}

	void inorder(Node node) {
		if (node == null)
			return;

		// Traverse left
		inorder(node.left);
		// Traverse root
		System.out.print(node.item + "->");
		// Traverse right
		inorder(node.right);
	}

	void preorder(Node node) {
		if (node == null)
			return;

		// Traverse root
		System.out.print(node.item + "->");
		// Traverse left
		preorder(node.left);
		// Traverse right
		preorder(node.right);
	}

	// 1
	// 12 9

	// 5 6
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(6);

		System.out.println("Inorder traversal");
		tree.inorder(tree.root);

		System.out.println("\nPreorder traversal ");
		tree.preorder(tree.root);

		System.out.println("\nPostorder traversal");
		tree.postorder(tree.root);

		// size of Node
		int size = tree.size(tree.root);
		System.out.println("size :" + size);

		// maximum
		int max = tree.maximum(tree.root);
		System.out.println("maximum value " + max);

	}

	int maximum(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		} else {

			return Math.max(root.item, Math.max(maximum(root.left), maximum(root.right)));
		}

	}

	int size(Node node) {
		if (node == null)
			return 0;
		else
			return (size(node.left) + 1 + size(node.right));
	}
	

	/*
	 * // Function to delete given element // in binary tree static void delete(Node
	 * root, int key) { if (root == null) return;
	 * 
	 * if (root.left == null && root.right == null) { if (root.item == key) {
	 * root=null; return; } else return; }
	 * 
	 * Queue<Node> q = new LinkedList<Node>(); q.add(root); Node temp = null,
	 * keyNode = null;
	 * 
	 * // Do level order traversal until // we find key and last node. while
	 * (!q.isEmpty()) { temp = q.peek(); q.remove();
	 * 
	 * if (temp.item == key) keyNode = temp;
	 * 
	 * if (temp.left != null) q.add(temp.left);
	 * 
	 * if (temp.right != null) q.add(temp.right); }
	 * 
	 * if (keyNode != null) { int x = temp.key; deleteDeepest(root, temp);
	 * keyNode.key = x; } }
	 */
	 
}