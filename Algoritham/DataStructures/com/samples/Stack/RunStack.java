package com.samples.Stack;

import java.util.Arrays;
import java.util.Stack;

public class RunStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyStackArray stack = new MyStackArray();
		stack.push(6);
		stack.push(9);
		stack.push(3);
		stack.push(2);

		stack.print();
		System.out.println("isEmpty "+stack.isEmpty());
		

		System.out.println("p0p mystack "+stack.pop());
		System.out.println("p0p mystack "+stack.pop());
		System.out.println("p0p mystack "+stack.pop());
		System.out.println("isEmpty "+stack.isEmpty());
	
		
		/*
		 * Stack<Integer> stk = new Stack<>(); stk.push(6); stk.push(9); stk.push(3);
		 * stk.push(2); stk.push(98);
		 * 
		 * System.out.println("Stack :"+stk.toString());
		 * System.out.println("peep"+stk.peek());
		 * 
		 * System.out.println("peep"+stk.peek()); System.out.println("pop"+stk.pop());
		 * System.out.println("pop"+stk.pop()); System.out.println("pop"+stk.pop());
		 */
				
		
	}
	
	
	

}
