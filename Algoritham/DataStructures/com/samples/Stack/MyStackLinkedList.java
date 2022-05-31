package com.samples.Stack;

public class MyStackLinkedList {
	
	//The linked list implementation of a stack can grow and shrink according to the needs at runtime. 
	// Requires extra memory due to involvement of pointers

	StackNode root;

	class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
		}

	}

	public void push(int data) {
		StackNode newNode = new StackNode(data);

		if (root == null) {
			root = newNode;
		} else {

			StackNode temp = root;
			root = root;
			root.next = temp;

		}

	}

	public static void main(String[] args) {

		MyStackLinkedList list = new MyStackLinkedList();
		list.push(10);
		list.push(11);

	}

}
