package com.samples.Linkedlist;

public class RunLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList list = new MyLinkedList();

		Node node = new Node("10");
		node.next = new Node("6");
		node.next.next = new Node("2");
		node.next.next.next = new Node("5");
		node.next.next.next.next = new Node("4");
		node.next.next.next.next.next = new Node("9");
		list.head = node;

		list.sortLinkedList(list);

		MyLinkedList.print(list);

	}

}
