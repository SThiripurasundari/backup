package com.samples.Linkedlist;

import java.util.Stack;

public class CheckPalinNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node nodes = createLinkedlIst2();
		// int size = getSize(nodes);
		// System.out.println("size :" + size);
		 boolean isPal = isPalindrome(createLinkedlIst2());
		 System.err.println("ANs "+isPal);
		// nodes = deletFromListAt(nodes, 5);
		// nodes = removeNthFromEnd(nodes, 1);

		nodes = reverse(nodes);
		print(nodes);
		// remove nth from end

	}

	private static Node reverse(Node node) {
		Node previous = null;
		Node current = node;
		Node next = null;

		// 1. Take the next node and save it in temp for future iteration and so that
		// we don't loose hold of next. 
		// 2. now remove the link of current and current next and move that next ptr to
		// previous       previous to next
		// 3. move current to previous
		// 4. Move temp to current
		while (current != null) {
			System.out.println("----while ----");
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			print(previous);
			print(current);
		}

		return previous;
	}

	private static Node deletFromListValue(Node nodes, String deleteThis) {

		Node iterateThis = nodes;// head

		if (iterateThis != null && iterateThis.data.equals(deleteThis)) {
			return iterateThis.next;

		}
		Node previous = null;

		while (iterateThis != null && !iterateThis.data.equals(deleteThis)) {
			previous = iterateThis;
			iterateThis = iterateThis.next;
		}

		if (iterateThis.data.equals(deleteThis)) {
			previous.next = iterateThis.next;

		}

		return nodes;

	}

	private static Node deletFromListAt(Node currentNode, int delAt) {

		Node iterateThis = currentNode;
		if (iterateThis != null && delAt == 0) {
			return iterateThis.next;

		}

		int counter = 0;
		Node previous = null;

		while (iterateThis != null && counter != delAt) {

			previous = iterateThis;
			iterateThis = iterateThis.next;
			counter++;

		}

		if (counter == delAt) {
			previous.next = iterateThis.next;

		}

		return currentNode;

	}

	private static Node removeNthFromEnd(Node node, int atThis) {

		int size = getSize(node);
		int deletAtthis = size - atThis;
		return deletFromListAt(node, deletAtthis);
	}

	private static Node createLinkedlIst2() {
		MyLinkedList list = new MyLinkedList();

		Node node = new Node("1");
		node.next = new Node("2");
		node.next.next = new Node("3");
		node.next.next.next = new Node("3");
		node.next.next.next.next = new Node("2");
		node.next.next.next.next.next = new Node("1");

		return node;

	}

	private static int getSize(Node node) {
		int count = 0;
		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}

	private static boolean isPalindrome(Node node) {
		boolean yesitis = true;
		Stack<String> stack = new Stack<String>();
		Node copyNode = node;
		while (node != null) {
			stack.push(node.data);
			node = node.next;
		}
		System.out.println("Stack: " + stack.toString());

		while (copyNode != null) {
			String data = stack.pop();
			if (! copyNode.data.equals(data)) {
				yesitis = false;
				System.out.println("they are not equal");
				break;
			}
			copyNode = copyNode.next;
		}

		return yesitis;

	}

	public static void print(Node node) {

		System.out.println("------------------Entering Print----------------");
		while (node != null) {
			System.out.println("Data : " + node.data);
			node = node.next;

		}

	}

}
