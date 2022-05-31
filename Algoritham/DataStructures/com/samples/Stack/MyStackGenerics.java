package com.samples.Stack;

import java.util.ArrayList;
import java.util.List;

public class MyStackGenerics<E> {

	int size = 0;
	ArrayList<E> list;
	int top = -1;

	public MyStackGenerics(int size) {
		super();
		this.size = size;
		list = new ArrayList<E>(size);
	}

	public static void main(String[] args) {
		MyStackGenerics<Integer> list = new MyStackGenerics(3);
		list.push(10);
		list.push(11);
		list.push(10);
		list.push(10);

		list.push(10);
		

		 
        // Creating an object of Stack class
        // Declaring objects of Integer type
        MyStackGenerics<Integer> s1 = new MyStackGenerics(0);
 
        // Pushing elements to integer stack - s1
 
        // Element 1 - 10
        s1.push(10);
        // Element 2 - 20
        s1.push(20);
        // Element 3 - 30
        s1.push(30);
 
        // Print the stack elements after pushing the
        // elements
        System.out.println(
            "s1 after pushing 10, 20 and 30 :\n" + s1);
 
        // Now, pop from stack s1
        s1.pop();
 
        // Print the stack elements after poping few
        // element/s
        System.out.println("s1 after pop :\n" + s1);
 
        // String Stack
 
        // Creating an object of Stack class
        //<E> Declaring objects of Integer type
        MyStackGenerics<String> s2 = new MyStackGenerics<>(3);
 
        // Pushing elements to string stack - s2
 
        // Element 1 - hello
        s2.push("hello");
        // Element 2 - world
        s2.push("world");
        // Element 3 - java
        s2.push("java");
 
        // Print string stack after pushing above string
        // elements
        System.out.println(
            "\ns2 after pushing 3 elements :\n" + s2);
 
        System.out.println(
            "s2 after pushing 4th element :");
 
        // Pushing another element to above stack
 
        // Element 4 - GFG
        s2.push("GFG");
 
        // Float stack
 
        // Creating an object of Stack class
        // Declaring objects of Integer type
        MyStackGenerics<Float> s3 = new MyStackGenerics(0);
 
        // Pushing elements to float stack - s3
 
        // Element 1 - 100.0
        s3.push(100.0f);
        // Element 2 - 200.0
        s3.push(200.0f);
 
        // Print string stack after pushing above float
        // elements
        System.out.println(
            "\ns3 after pushing 2 elements :\n" + s3);
        System.out.println("top element of s3:\n"
                + s3.top());
	}

	public void push(E data) {
		if (top + 1 == size) {
			System.out.println("Stack Overflow");

		} else {
			top++;
			if (list.size() > top)
				list.set(top, data);

			else

				// Creating new element
				list.add(data);
			// list.add(top, data);

		}
		System.out.println("TOP :" + top);

	}

	E top() {
		// If stack is empty
		if (top == -1) {

			// Display message when there are no elements in
			// the stack
			System.out.println("Stack Underflow");

			return null;
		}

		// else elements are present so
		// return the topmost element
		else
			return list.get(top);
	}

	void pop() {
		// If stack is empty
		if (top == -1) {

			// Display message when there are no elements in
			// the stack
			System.out.println("Stack Underflow");
		}

		else

			// Delete the last element
			// by decrementing the top
			top--;
	}

	boolean empty() {
		return top == -1;
	}

	public String toString() {

		String Ans = "";

		for (int i = 0; i < top; i++) {
			Ans += String.valueOf(list.get(i)) + "->";
		}

		Ans += String.valueOf(list.get(top));

		return Ans;
	}

}
