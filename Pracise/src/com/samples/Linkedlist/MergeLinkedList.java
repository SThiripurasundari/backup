package com.samples.Linkedlist;

public class MergeLinkedList {

	public static Node mergeTwoLists(Node l1, Node l2) {
		Node result = new Node(-1);
		Node temp = result;

		while (l1 != null && l2 != null) {
			if (l1.value < l2.value) {
				temp.next = l1;
				l1 = l1.next;

			} else {
				temp.next = l2;
				l2 = l2.next;

			}
			temp = temp.next;
			
		//	System.out.println("-------------temp------------------");
			//printList(temp);
			//System.out.println("--------------R-----------------");
			//printList(result);
		}
		
		if(l1 == null) {
			temp.next = l2;
	    } else {
	    	temp.next = l1;
	    }
	    
		return result.next;
	}

	// A utility function to print linked list
	static void printList(Node node) {

		while (node != null) {
			System.out.println(node.value + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(4);

		// 1->3->5 LinkedList created
		Node head2 = new Node(3);
		head2.next = new Node(5);
		//head2.next.next = new Node(5);

		// 0->2->4 LinkedList created
		Node mergedhead = mergeTwoLists(head1, head2);

		//printList(mergedhead);

	}

}
