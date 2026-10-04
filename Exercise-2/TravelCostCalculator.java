package TravelCostCalculator;

public class TravelCostCalculator {

	public static void main(String[] args) {
		int distance = 450;
		double consumptionPer100Km = 7.5;
		int fuelPrice = 52;
		int highwayFee = 250;
		int numberOfPeople = 3; 
			double totalFuelConsumption = (distance * consumptionPer100Km) / 100; 
			double fuelCost = totalFuelConsumption * fuelPrice;
			double totalTravelCost = fuelCost + highwayFee;
			double costPerPerson = totalTravelCost / numberOfPeople;
		System.out.println("Total Fuel Consumption: " + totalFuelConsumption);
		System.out.println("Fuel Cost             : " + fuelCost);
		System.out.println("Total Travel Cost     : " + totalTravelCost);
		System.out.println("Cost Per Person       : " + costPerPerson);			
	}
				
}


