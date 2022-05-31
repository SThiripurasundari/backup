package com.design.BuilderPattern;

public class BuilderImpl {

	public static void main(String[] args) {

		Phone ph = new PhoneBuilder().setId("id").setName("Name").setPrice("90").getPhone();

		System.out.println("Phone :"+ph);

	}

}
