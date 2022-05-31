package com.deign.factory;

public class FactoryImlp {

	public static void main(String[] args) {

		FactoryImlp imlp = new FactoryImlp();
		Shape shape = imlp.getSubObjects("Square");

		shape.testingFactory();

	}

	public Shape getSubObjects(String type) {

		if (type.equalsIgnoreCase("Circle"))

		{
			return new Circle();
		}
		if (type.equalsIgnoreCase("Square"))

		{
			return new Circle();
		}
		if (type.equalsIgnoreCase("Rectangle"))

		{
			return new Circle();
		}

		else
			return null;

	}

}
