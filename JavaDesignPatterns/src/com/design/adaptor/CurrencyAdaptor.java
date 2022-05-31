package com.design.adaptor;

public class CurrencyAdaptor implements PriceCalculator{
	
	UKCarPriceCalculator uk ;

	public CurrencyAdaptor(UKCarPriceCalculator uk) {
		super();
		this.uk = uk;
	}

	@Override
	public String getPriceInCurrency(String model, int year) {
		// TODO Auto-generated method stub
		return uk.getPrice(model, year) + "Rs";
	}

}
