package com.samples.Linkedlist;

public class Node {

	String data;
	int value;
	public Node(String data) {
		super();
		this.data = data;
	}
	
	public Node(int value) {
		super();
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	Node next;
	
}
