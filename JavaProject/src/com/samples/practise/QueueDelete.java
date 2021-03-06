package com.samples.practise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDelete {

	int head;
	int tail;
	int[] list;
	int size;

	QueueDelete(int size) {
		this.size = 0;
		head = -1;
		tail = -1;
		list = new int[size];
	}
	public boolean isFull() {
		return size == list.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void enqueue(int i) {
		//System.out.println("size in enq" +size);
		if(tail == size)
		{
			throw new RuntimeException("Full");
		}
		
		if(tail == (list.length -1))
		{
			System.err.println("reset tail to -1");
			tail = -1;
			
		}
		
		
		list[++tail] = i;
		size++;
		//System.out.println("size in enq" +size);
	}
	
	private int deque() {
		//System.out.println("size" +size);
		if(size == 0)
		{
			throw new RuntimeException("Empty");
		}
		if (head == list.length - 1) {
			System.err.println("head == queue.length - 1");
			head = -1;
		}
		size--;
		return list[++head];
		
		
		
	}

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println("out :"+q.poll());
		System.out.println("out :"+q.poll());
		System.out.println("out :"+q.poll());
		System.out.println("out :"+q.poll());
		System.out.println("out :"+q.poll());

		QueueDelete del = new QueueDelete(4);
		del.enqueue(1);
		del.enqueue(2);
		del.enqueue(3);
		del.enqueue(4);
		del.enqueue(5);
		
		System.out.println("out2 :"+del.deque());
		System.out.println("out2 :"+del.deque());
		System.out.println("out2 :"+del.deque());
		System.out.println("out2 :"+del.deque());
		System.out.println("out2 :"+del.deque());

	}

	

}
