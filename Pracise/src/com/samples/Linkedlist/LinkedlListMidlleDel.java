package com.samples.Linkedlist;

public class LinkedlListMidlleDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node = new Node("1");
		node.next = new Node("2");
		node.next.next = new Node("3");
		node.next.next.next = new Node("4");
		node.next.next.next = new Node("5");

		Node slowptr = middleNode(node);
		print(slowptr);
	}

	public static Node middleNode(Node head) {
		Node slowPtr = head;
		Node fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;

		}
		return slowPtr;

	}
	

	public static void print(Node node) {

		while (node != null) {
			System.out.println("Data : " + node.data);
			node = node.next;

		}

	}

}
