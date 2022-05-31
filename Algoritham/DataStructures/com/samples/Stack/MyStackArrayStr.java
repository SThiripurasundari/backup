package com.samples.Stack;

public class MyStackArrayStr {

	final int size = 2;
	String[] str = new String[size];
	int top = -1;

	public boolean isEmpty() {
		if (top < 0) {
			return true;
		} else {
			return false;

		}

	}

	/*
	 * public void push(int item) { if (top == items.length-1) throw new
	 * RuntimeException("Stack is full"); items[++top] = item; }
	 */

	public void push(String data) {

		if (top >= size - 1) {
			System.out.println("Stack Overflow");
		} else

			str[++top] = data;
		System.out.println("Index " + top);

	}

	public String pop() {

		if (isEmpty()) {
			System.out.println("Stack is empty");
			return "";
		} else {

			return str[top--];
		}
	}

	public String peek() {

		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}

		return str[top];

	}

	public static void main(String[] args) {

		MyStackArrayStr stack = new MyStackArrayStr();
		System.out.println(stack.isEmpty());

		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}

}
