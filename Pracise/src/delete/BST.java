package delete;

class NodeForBST {
	int data;
	NodeForBST right;
	NodeForBST left;

	NodeForBST(int data) {
		this.data = data;
	}

}

public class BST {

	NodeForBST root;

	public static void main(String[] args) {

		BST tree = new BST();
		tree.root = tree.insert(tree.root, 8);
		tree.insert(tree.root, 3);
		tree.insert(tree.root, 1);
		tree.insert(tree.root, 6);
		tree.insert(tree.root, 7);
		tree.insert(tree.root, 10);
		tree.insert(tree.root, 14);
		tree.insert(tree.root, 4);
		
		tree.deleteNode(tree.root, 10);

		BST tree2 = new BST();
		int arr[] = new int[] { 1, 3, 4, 6, 7, 8, 10, 14 };
		int n = arr.length;
		tree2.root = tree2.sortedArrayToBST(arr, 0, n - 1);
		System.out.println("Preorder traversal of constructed BST");
		tree2.preOrder(tree2.root);

		System.out.println("pre traversal");
		tree.preOrder(tree.root);

		System.out.println("Inorder traversal");
		tree.inorder(tree.root);

		System.out.println("srach " + tree.search(tree.root, 1));

		/*
		 * NodeForBST xyz = tree.find(tree.root, 100); System.out.println("find " +
		 * xyz.data);
		 * 
		 * System.out.println("Maximum " + tree.getMaximum(tree.root));
		 * System.out.println("Min " + tree.getMin(tree.root));
		 * System.out.println("size " + tree.size(tree.root));
		 */

		System.out.println("post traversal");
		tree.postOrder(tree.root);

	}

	// this cod eis not working 
	NodeForBST deleteNode(NodeForBST root, int data) {

		if (root == null)
			return root;

		if (data > root.data) {

			root = deleteNode(root.right, data);

		} else if (data < root.data) {

			root = deleteNode(root.left, data);
		} else {

			if (root.left == null) {
				return root.right;
			}
			if (root.right == null) {
				return root.left;
			}

			int value = getMin(root.right);
		
			int value2 = minValue(root.right);
	
			return deleteNode(root.right, value2);

		}
		return root;

	}

	private static int minValue(NodeForBST root) {
		int min = root.data;
		while (root.left != null) {
			min = root.left.data;
			root = root.left;

		}

		return min;
	}

	/*
	 * private static int maxValue(NodeForBST bst) { int data = bst.data;
	 * 
	 * while(bst.right !=null) { bst= bst.right; data = bst.data;
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 * 
	 */

	boolean search(NodeForBST root, int data) {
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


	private NodeForBST find(NodeForBST root, int data) {
		if (root == null) {
			return null;
		}
		if (root.data == data) {
			return root;
		}

		if (data > this.root.data && root.right != null) {
			return find(root.right, data);

		} else {

			return find(root.left, data);

		}

	}

	private int size(NodeForBST root) {
		if (root == null) {
			return 0;
		}
		return (size(root.left) + size(root.right) + 1);

	}

	int getMin(NodeForBST root) {

		if (root == null)
			return Integer.MAX_VALUE;

		return Math.min(root.data, Math.min(getMin(root.left), getMin(root.right)));

	}

	int getMaximum(NodeForBST root) {

		if (root == null)
			return Integer.MIN_VALUE;

		return Math.max(root.data, Math.max(getMaximum(root.left), getMaximum(root.right)));

	}

	NodeForBST insert(NodeForBST root, int data) {
		if (root == null) {
			root = new NodeForBST(data);
			return root;
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		} else if (data < root.data) {
			root.left = insert(root.left, data);
		}

		return root;

	}

	private void preOrder(NodeForBST node) {// LNR
		if (node == null) {
			return;
		}
		preOrder(node.left);
		System.out.print(" -->" + node.data);
		preOrder(node.right);
	}

// wrong 
	private void inorder(NodeForBST node) {// NLR
		if (node == null) {
			return;
		}
		System.out.print(" -->" + node.data);
		inorder(node.left);
		inorder(node.right);
	}

	private void postOrder(NodeForBST node) {// LRN
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(" -->" + node.data);
	}

	NodeForBST sortedArrayToBST(int arr[], int start, int end) {

		/* Base Case */
		if (start > end) {
			return null;
		}

		/* Get the middle element and make it root */
		int mid = (start + end) / 2;
		NodeForBST node = new NodeForBST(arr[mid]);

		/*
		 * Recursively construct the left subtree and make it left child of root
		 */
		node.left = sortedArrayToBST(arr, start, mid - 1);

		/*
		 * Recursively construct the right subtree and make it right child of root
		 */
		node.right = sortedArrayToBST(arr, mid + 1, end);

		return node;
	}

}
