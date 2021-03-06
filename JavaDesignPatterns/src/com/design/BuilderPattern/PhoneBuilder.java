package com.design.BuilderPattern;

public  class PhoneBuilder {
	
	String name;
	String id;
	String price;
	
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public PhoneBuilder setId(String id) {
		this.id = id;
		return this;
	}

	public PhoneBuilder setPrice(String price) {
		this.price = price;
		return this;
	}

	public Phone getPhone() {
		return new Phone(name, id, price);

	}
}
