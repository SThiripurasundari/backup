package com.samples.Linkedlist;

import java.util.Stack;

public class LinkedListFinal {

	NodeLS head;

	public static void main(String[] args) {
		LinkedListFinal list = new LinkedListFinal();
		list.insert(list, 1);
		list.insert(list, 3);
		list.insert(list, 5);
		list.insert(list, 7);
		list.insert(list, 9);
		list.insert(list, 11);


		LinkedListFinal list2 = new LinkedListFinal();
		list2.insert(list2, 2);
		list2.insert(list2, 4);
		list2.insert(list2, 6);
		list2.insert(list2, 8);
		list2.insert(list2, 10);
		
		list.mergeLinkedlIst(list, list2);
		
		
		LinkedListFinal.print(list);

		// list2.middleNode(list2, 77);

		// LinkedListDelete.print(list2);

	}

	private void mergeLinkedlIst(LinkedListFinal list, LinkedListFinal list2) {
		LinkedListFinal finalList = new LinkedListFinal();
		int size1 = list.getSize(list);
		int size2 = list.getSize(list2);
		int t =0;
		
		if(size1>size2)
		{
			for( t= 0; t< size2 ;t++)
			{
				list.insert(finalList, size2);
				
			}
			
		}
		else
		{
			
			
			
			
		}
		
		
		
	}

	public boolean isCyclic() {
		NodeLS fast = head;
		NodeLS slow = head;
		while (fast != null && fast.node != null) {
			fast = fast.node.node;
			slow = slow.node;
			// if fast and slow pointers are meeting then LinkedList is cyclic
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	

	private static void reverseLinkedList(LinkedListFinal list) {

		NodeLS current = list.head;
		NodeLS temp = null;
		NodeLS previous = null;

		while (current != null) {

			temp = current.node;
			current.node = previous;
			previous = current;
			current = temp;

		}

		list.head = previous;

	}

	// fast will iterate from the first while slow will iterate starting from give
	// end position only so assume if the position from end is 3
	// then slow iteration starts when counter cross 3
	public int getLastNode(int n) {
		NodeLS fast = head;
		NodeLS slow = head;
		int start = 1;
		while (fast.node != null) {
			fast = fast.node;
			start++;
			if (start > n) {
				slow = slow.node;
			}
		}

		System.err.println("fats " + fast.data);
		System.err.println("slow " + slow.data);

		return slow.data;
	}

	private static boolean isPalindrome(LinkedListFinal list) {
		boolean isPalindorme = true;

		Stack<Integer> stck = new Stack();

		NodeLS head = list.head;

		while (head != null) {
			stck.push(head.data);
			head = head.node;
		}

		NodeLS it = list.head;
		while (it != null) {
			if (it.data == stck.pop()) {
				it = it.node;
			} else {
				isPalindorme = false;
				break;

			}
		}

		return isPalindorme;
	}

	public void middleNode(LinkedListFinal list, int data) {
		NodeLS slowPtr = list.head;
		NodeLS fastPtr = list.head;

		while (fastPtr != null && fastPtr.node != null) {
			slowPtr = slowPtr.node;
			fastPtr = fastPtr.node.node;

		}
		NodeLS insertThis = new NodeLS(data);
		insertThis.node = slowPtr.node.node;

		slowPtr.node = insertThis;

	}

	private void insertATMiddle(LinkedListFinal list, int data) {
		int size = getSize(list);
		NodeLS newData = new NodeLS(data);
		int mid = 1 + (size / 2);
		System.out.println("size " + size);
		System.out.println("size " + mid);

		if (mid < 1) {
			System.out.println("One data only ther ");
		}

		NodeLS temp = list.head;
		NodeLS previous = null;
		int counter = 1;

		while (temp != null && mid != counter) {
			counter++;
			previous = temp;
			temp = temp.node;
		}

		if (previous != null & mid == counter) {
			previous.node = newData;
			newData.node = temp;

		}

	}

	private void deletAtPosition(LinkedListFinal list, int i) {
		NodeLS tempNode = list.head;
		int counter = 0;

		if (i == 0) {
			list.head = list.head.node;

		}

		NodeLS previous = null;
		counter = 1;
		while (tempNode != null && counter != i) {
			counter++;
			previous = tempNode;
			tempNode = previous.node;

		}

		if (tempNode == null) {
			System.out.println("data not found");
			return;
		}

		if (counter == i)

		{
			previous.node = tempNode.node;
		}

	}

	private void delete(LinkedListFinal list, int data) {
		NodeLS tempNode = list.head;

		// if head itself has that data
		if (tempNode != null && tempNode.data == data) {
			list.head = list.head.node;
		}

		// other than head
		NodeLS previous = null;

		while (tempNode != null && tempNode.data != data) {
			previous = tempNode;
			tempNode = previous.node;

		}
		if (tempNode == null) {
			System.out.println("Not found");
			return;
		}
		if (tempNode.data == data) {

			previous.node = tempNode.node;

		}

	}

	private void insert(LinkedListFinal list, int i) {
		NodeLS newnode = new NodeLS(i);

		if (list.head == null) {
			list.head = newnode;
		} else {
			NodeLS temp = list.head;
			while (temp != null && temp.node != null) {
				temp = temp.node;
			}
			temp.node = newnode;

		}

	}

	static int getSize(LinkedListFinal list) {
		NodeLS temp = list.head;
		int t = 1;
		while (temp != null) {
			t++;
			temp = temp.node;

		}
		return t;

	}

	private static void removeNthFromEnd(LinkedListFinal list, int atThis) {

		int size = getSize(list);
		int deletAtthis = size - atThis;
		list.deletAtPosition(list, deletAtthis);
	}

	static void print(LinkedListFinal list) {
		System.out.println("-------------------------------------");
		NodeLS temp = list.head;
		while (temp != null) {
			System.out.println("Data :" + temp.data);
			temp = temp.node;

		}

	}

}
