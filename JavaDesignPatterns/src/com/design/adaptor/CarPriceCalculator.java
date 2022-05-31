package com.design.adaptor;

import com.deign.factory.Shape;


public class CarPriceCalculator implements PriceCalculator {
	
	@Override
	public String getPriceInCurrency(String model, int year) {
		// TODO Auto-generated method stub
		return model + "USD" ;
	}

	
}
