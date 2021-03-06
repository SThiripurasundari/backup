package com.design.adaptor;

public class AdaptorImpl {

	public static void main(String[] args) {

		PriceCalculator car = new CarPriceCalculator();
		calculateAndPrint(car, "USCar", 2003);

		PriceCalculator truck = new TruckPriceCalculator();
		calculateAndPrint(truck, "STruck" , 2001);

		UKCarPriceCalculator ukprice = new UKCarPriceCalculator();

		PriceCalculator uk = new CurrencyAdaptor(ukprice);
		calculateAndPrint(uk, "UKCar", 2000);

	}

	private static void calculateAndPrint(PriceCalculator cal, String car, int year)

	{

		System.out.println(" Ans :" + cal.getPriceInCurrency(car, year));

	}
	
	// Creational - SIngleton , Facory Pattern , Abstarck Factory pattern , Builder pattern and Prototype pattern 
	// Structural - Adaptor pattern 
	// Beh -Iterator pattern, chain of responsibilty  , template pattern 
	// J2ee Patterns - DAO pattern, MVC Pattern , Business delegate pattern , filter pattern 
	
	
	
	
	
	
}
