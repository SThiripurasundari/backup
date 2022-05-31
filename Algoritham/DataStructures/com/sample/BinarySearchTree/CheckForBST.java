package com.sample.BinarySearchTree;

public class CheckForBST {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new Node(20);
		tree.root.left = new Node(10);
		tree.root.right = new Node(40);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(15);
		tree.root.right.left = new Node(30);
		tree.root.right.right = new Node(50);
		System.out.println(isBST(tree.root));

	}

	static Boolean isBST(Node root) {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static Boolean isBSTUtil(Node root, int minValue, int maxValue) {
		if (root == null)
			return true;
		if (root.data > maxValue || root.data < minValue) {
			return false;
		}
		return isBSTUtil(root.left, minValue, root.data - 1) && isBSTUtil(root.right, root.data + 1, maxValue);
	}

}
