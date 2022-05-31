package com.samples.Stack;

import java.util.Arrays;


// Easy to implement. Memory is saved as pointers are not involved. 
//It is not dynamic. It doesn’t grow and shrink depending on needs at runtime.




public class MyStackArray {
	int max_size = 2;
	int[] stack = new int[max_size];
	int top = -1;

	public boolean isEmpty() {
		if (top < 0) {

			return true;
		} else
			return false;

	}

	public boolean push(int data) {
		if (top >= max_size - 1) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			top = top + 1;
			stack[top] = data;
			return true;
		}

	}

	public int peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = stack[top];
			return x;
		}

	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {

			int data = stack[top];
			System.out.println("Top :"+top + " ;" +Arrays.toString(stack) + stack.length);
			top--;
			System.out.println("Top :"+top + " ;" +Arrays.toString(stack) + stack.length);
			return data;
		}

	}

	public void print() {
		System.out.println("MyStack :" + Arrays.toString(stack));

	}

}
