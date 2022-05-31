package delete;

import javax.print.attribute.Size2DSyntax;

class Node {
	int data;
	Node right;
	Node left;

	Node(int data) {
		this.data = data;
	}

}

public class BT {

	Node root;

	public static void main(String[] args) {

		BT binaryTree = new BT();
		binaryTree.root = new Node(10);
		binaryTree.root.left = new Node(20);
		binaryTree.root.right = new Node(40);
		binaryTree.root.left.left = new Node(60);
		binaryTree.root.left.right = new Node(70);
		
		System.out.println("Maximum " +binaryTree.getMaximum(binaryTree.root));
		System.out.println("Min " +binaryTree.getMin(binaryTree.root));
		
		System.out.println("Size :"+ binaryTree.size(binaryTree.root));
		System.out.println("Size :"+ binaryTree.numOfLeafNodes(binaryTree.root));

		

		System.out.println("Inorder traversal");
		binaryTree.inorder(binaryTree.root);
		
		System.out.println("pre traversal");
		binaryTree.preOrder(binaryTree.root);
		
		System.out.println("post traversal");
		binaryTree.postOrder(binaryTree.root);

	}

	// thscode is not working here inthis class
	public int numOfLeafNodes(Node root) {
		if (isLeaf()) return 1;
		int leftLeaves = 0;
		int rightLeaves = 0;
		if (root.left != null)
			leftLeaves = numOfLeafNodes(root.left);
		if (root.right != null)
			rightLeaves = numOfLeafNodes(root.right);
		return leftLeaves + rightLeaves;
	}
	public boolean isLeaf() {
		return this.root.left == null && this.root.right == null;
	}
	
	private int size(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		return (size(root.left)+ size(root.right)+1);
		
	}

	private void preOrder(Node node) {// LNR
		if(node == null)
		{
			return;
		}
		preOrder(node.left);
		System.out.print(" -->" + node.data);
		preOrder(node.right);
	}

	private void inorder(Node node) {// NLR
		if(node == null)
		{
			return;
		}
		System.out.print(" -->" + node.data);
		inorder(node.left);
		inorder(node.right);
	}

	private void postOrder(Node node) {// LRN
		if(node == null)
		{
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(" -->" + node.data);
	}

	
	int getMaximum(Node root)
	{
		
		if(root == null)
			return Integer.MIN_VALUE;
		
		return Math.max(root.data, Math.max(getMaximum(root.left), getMaximum(root.right)));
		
	}

	int getMin(Node root)
	{
		
		if(root == null)
			return Integer.MAX_VALUE;
		
		return Math.min(root.data, Math.min(getMin(root.left), getMin(root.right)));
		
	}
	
}
