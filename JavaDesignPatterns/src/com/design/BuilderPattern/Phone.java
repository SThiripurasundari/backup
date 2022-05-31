package com.design.BuilderPattern;

public class Phone {
	@Override
	public String toString() {
		return "Phone [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	public Phone(String name, String id, String price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	String name;
	String id;
	String price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}
