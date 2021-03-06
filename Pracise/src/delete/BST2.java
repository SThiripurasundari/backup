package delete;

class NodeBST {

	int data;
	NodeBST right;
	NodeBST left;

	NodeBST(int data) {

		this.data = data;
	}

}

public class BST2 {
	NodeBST root;

	public static void main(String[] args) {

		BST2 bst = new BST2();
		bst.root = bst.insert(bst.root, 60);
		bst.insert(bst.root, 50);
		bst.insert(bst.root, 40);
		bst.insert(bst.root, 30);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 1);

		inorder(bst.root);

		bst.find(bst.root, 2);

		int ans = bst.getMaxData(bst.root);
		System.out.println("ans " + ans);

		int min = bst.getMin(bst.root);
		System.out.println("min " + min);

		bst.deleteNode(bst.root, 30);
		inorder(bst.root);

	}

	private NodeBST deleteNode(NodeBST root, int data) {

		if (root == null) {
			return root;
		}

		if (root.data < data) {
			root.right = deleteNode(root.right, data);

		} else if (root.data > data) {

			root.left = deleteNode(root.left, data);
		} else {
			if (root.left == null) {
				return root.right;
			}

			else if (root.right == null) {
				return root.left;
			}

			int min = getMin(root.right);

			root.right = deleteNode(root.right, data);

		}
		return root;

	}

	private int getMin(NodeBST root) {

		int minData = root.data;

		while (root.left != null) {
			minData = root.left.data;
			root = root.left;

		}
		return minData;

	}

	private int getMaxData(NodeBST root2) {

		if (root2 == null) {
			return 0;
		}

		;
		return Math.max(root2.data, Math.max(getMaxData(root2.right), (getMaxData(root2.left))));

	}

	private void find(NodeBST root2, int i) {

		if (root2 == null) {

			return;
		}
		if (root2.data == i) {
			System.out.println("Found +" + i);
		}
		if (root2.data < i) {
			find(root2.right, i);

		} else {
			find(root2.left, i);

		}

	}

	private NodeBST insert(NodeBST root2, int data) {

		if (root2 == null) {
			root2 = new NodeBST(data);
			return root2;

		}

		if (root2.data < data) {
			root2.right = insert(root2.right, data);

		} else {
			root2.left = insert(root2.left, data);

		}

		return root2;
	}

	private static void inorder(NodeBST bst) {
		if (bst == null) {
			return;
		}

		inorder(bst.left);
		System.out.print(bst.data + "-> ");
		inorder(bst.right);

	}

}
