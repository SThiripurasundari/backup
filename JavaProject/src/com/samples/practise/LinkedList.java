package com.samples.practise;

import java.security.Principal;

class Node {

	public Node(int data) {
		super();
		this.data = data;
	}

	int data;
	Node next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}

public class LinkedList {

	Node root;

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		root.next.next.next = new Node(4);
		root.next.next.next.next = new Node(5);
		root.next.next.next.next.next = root;

		list.root = root;
		
		System.out.println("Is cyclic "+list.isCircular(root.next));;
		
		list.insetAtMiddle(list, 60);

		list.getNthNodeFromEnd(list, 2);

		// list.reverseList(list);
		// list.deleteAt(list, 1);
		// list.delete(list, 13);

		list.print(list);
		// System.out.println("size :" + list.size(list));

	}

	private void getNthNodeFromEnd(LinkedList list, int position) {
		Node fast = list.root;
		Node slow = list.root;
		int counter = 0;
		Node previous = null;

		while (fast != null) {
			counter++;
			fast = fast.next;

			if (counter > position) {
				previous = slow;
				slow = slow.next;
			}

		}

		previous.next = slow.next;

	}

	private void reverseList(LinkedList list) {
		Node current = list.root;
		Node previous = null;
		Node next = null;
		Node temp = null;

		while (current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;

		}

		list.root = previous;

	}

	private void delete(LinkedList list, int i) {
		Node root = list.root;
		Node previous = null;

		while (root != null && root.data != i) {
			previous = root;
			root = root.next;

		}

		if (root == null) {
			System.out.println("Data Not Found");
		}

		if (root.data == i) {
			previous.next = root.next;

		}

	}

	boolean isCircular(Node head) {
		if (head == null || head.next == head) {
			return true;
		}

		Node currNode = head.next;
		while (currNode != null) {
			if (currNode == head) {
				return true;
			}
			currNode = currNode.next;
		}

		return false;
	}

	private void deleteAt(LinkedList list, int i) {
		Node root = list.root;
		int counter = 1;
		Node previous = null;

		if (i == 1) {
			list.root = root.next;
			return;

		}

		while (root != null && counter != i) {
			previous = root;
			root = root.next;
			counter++;

		}

		if (counter == i) {
			previous.next = root.next;
		}

	}

	void insetAtMiddle(LinkedList list, int insertThis) {
		Node fastPointer = list.root;
		Node slowPointer = list.root;
		Node previous = null;
		Node node = new Node(insertThis);

		while (fastPointer != null) {
			previous = slowPointer;
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;

		}

		previous.next = node;
		node.next = slowPointer;

	}

	int size(LinkedList list) {
		Node root = list.root;
		int size = 0;

		while (root != null) {
			size++;
			root = root.next;

		}
		return size;
	}

	void print(LinkedList list) {
		Node root = list.root;

		while (root != null) {
			System.out.println("Data " + root.data);
			root = root.next;

		}

	}

}
