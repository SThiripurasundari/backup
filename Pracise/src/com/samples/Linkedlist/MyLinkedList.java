package com.samples.Linkedlist;

public class MyLinkedList {

	Node head;

	public MyLinkedList addtoList(MyLinkedList linkedlist, String data) {
		Node node = new Node(data);

		if (linkedlist.head == null) {
			linkedlist.head = node;
			return linkedlist;
		} else {
			Node tempForIteration = linkedlist.head;
			while (tempForIteration != null && tempForIteration.next != null) {
				tempForIteration = tempForIteration.next;
			}

			tempForIteration.next = node;
		}

		return linkedlist;
	}

	public MyLinkedList deleteThisFromList(MyLinkedList linkedlist, String deleteThi) {
		Node iterateThis = linkedlist.head;

		// if the data is at head then delete
		if (linkedlist.head != null && linkedlist.head.data.equals(deleteThi)) {
			linkedlist.head = linkedlist.head.next;// 1st node
			return linkedlist;
		}

		// take again head and iterate till data is found
		Node previous = null;
		while (iterateThis != null && !iterateThis.data.equals(deleteThi)) {
			previous = iterateThis;
			iterateThis = iterateThis.next;
		}

		// then check if data is not found if the iteration is done till end and reached
		// null
		if (iterateThis == null) {
			System.out.println("No Recors found");
		}

		// once that data is found , then check if data is not found
		if (iterateThis != null && iterateThis.data.equals(deleteThi)) {
			previous.next = iterateThis.next;
		}

		return linkedlist;

	}

	public MyLinkedList deletFromList(MyLinkedList linkedlist, int delAt) {

		Node currentNode = linkedlist.head;
		Node previous = null;

		// if the record is available at the start itself
		if (delAt == 0) {
			linkedlist.head = currentNode.next;
			print(linkedlist);
			return linkedlist;
			// else other than 1
		}
		int counter = 0;

		while (currentNode != null) {
			if (counter == delAt) {
				// System.out.println(delAt + " position element deleted");
				// System.out.println("current data :" + currentNode.data);
				previous.next = currentNode.next;
				break;

			} else {
				previous = currentNode;
				currentNode = currentNode.next;
				// System.out.println("node " + node.data);
				counter++;
			}
		}
		return linkedlist;

	}

	// uses Bubble sort

	public MyLinkedList sortLinkedList(MyLinkedList list) {
		Node current = list.head;
		Node next = null;
		String temp;

		if (head == null) {
			return null;
		} else {
			while (current != null) {
				// index points to the node next to current
				next = current.next;

				while (next != null) {
					if (Integer.parseInt(current.data) > Integer.parseInt(next.data)) {
						temp = current.data;
						current.data = next.data;
						next.data = temp;
					}
					next = next.next;
				}
				current = current.next;
			}
			return list;
		}

	}

	public static void print(MyLinkedList list) {
		Node node = list.head;

		while (node != null) {
			System.out.println("Data : " + node.data);
			node = node.next;

		}

	}
}
