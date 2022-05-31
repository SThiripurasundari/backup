package com.samples.Linkedlist;

import java.util.*;

public class CheckPalindromeMyLInkedList {

	public static void main(String[] args) {
		//boolean result = isPalindrome(createLinkedList());
		//System.out.println("result" + result);
		
		MyLinkedList list = createLinkedList();
		//list.deleteThisFromList(list, "6");
		//list.print(list);
		
		
		
	}

	private static boolean isPalindrome(MyLinkedList list) {
		Stack<String> stack = new Stack<String>();
		Node node1 = list.head;
		boolean yesIs = true;

		while (node1 != null) {
			stack.push(node1.data);
			node1 = node1.next;

		}

		Node node = list.head;
		while (node != null) {
			String abc = stack.pop();
			if (!abc.equals(node.data)) {
				return false;
			}
			node = node.next;
		}
		return yesIs;
	}

	private static MyLinkedList createLinkedList() {
		MyLinkedList list = new MyLinkedList();
		list.addtoList(list, "1");
		list.addtoList(list, "6");
		list.addtoList(list, "4");
		list.addtoList(list, "4");
		list.addtoList(list, "2");
		list.addtoList(list, "6");
		// 

		//list.sortLinkedList(list.head);
		MyLinkedList.print(list);
		return list;
	}

}

/*
 * ArrayList<String> array = new ArrayList<String>(); array.add("1");
 * array.add("2"); array.add("3");
 * 
 * System.out.println("array" + array.toString());
 * 
 * Stack<String> stack = new Stack<String>(); stack.push("1"); stack.push("2");
 * stack.push("3"); System.out.println("array" + array.toString())
 * 
 * for (int t = 0; t < array.size(); t++) { System.out.println("array data " +
 * array.get(t)); } while (!stack.isEmpty()) { String data = stack.pop(); //
 * System.out.println("stack data "+stack.get(t));
 * System.out.println("stack data " + data); }
 */
