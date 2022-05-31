package com.sample.BinarySearchTree;

class Node {
	public int data;

	public Node(int data) {
		this.data = data;
	}

	Node left;
	Node right;

}

public class BinarySearchTree {
	Node root;

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(tree.root, 50);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 80);

		tree.inorder();

	}

	boolean search(Node root, int data) {
		if (root == null) {
			return false;
		}
		if (root.data == data) {
			return true;
		}
		if (root.data > data) {
			return search(root.left, data);
		} else
			return search(root.right, data);
	}

	public static Node deleteNode(Node root, int key) {
		if (root == null) {
			return root;
		}

		// case 1 will be handled by this - ie. the key is end leaf node with both ends
		// null

		if (key < root.data) {
			root.left = deleteNode(root.left, key);
		} else if (key > root.data) {
			root.right = deleteNode(root.right, key);
		} else {
			// case when key == root.data

			// case 2 - same as above but the end node may have left or right node as null
			// but not both end as null unlike case 1

			if (root.left == null) {

				return root.right;

			} else if (root.right == null) {

				return root.left;
			}

			// case 3 - when both ends have some data then find the in value and

			root.data = minValue(root.right);
			root.right = deleteNode(root.right, root.data);

		}
		return root;

	}

	private static int minValue(Node root) {
		int min = root.data;
		while (root.left != null) {
			min = root.left.data;
			root = root.left;

		}

		return min;
	}

	/*
	 * void insert(int key) { root = insert(root, key); }
	 */
	// This method mainly calls InorderRec()
	void inorder() {
		inorderRec(root);
	}

	// A utility function to
	// do inorder traversal of BST
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
	}

	// important to set the return to either node.left or node.right
	Node insert(Node node, int data) {
		// reason we create new node but we don't assign to any node ,
		// just return which need to be set to parent left or right
		if (node == null) {
			return new Node(data);

		} else if (node.data > data) {
			node.left = insert(node.left, data);
		} else if (node.data < data) {
			node.right = insert(node.right, data);
		}
		return node;
	}

}
