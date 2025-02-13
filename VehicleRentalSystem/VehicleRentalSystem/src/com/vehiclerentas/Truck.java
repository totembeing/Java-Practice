package com.vehiclerentas;

//Sub-class of Vehicle
public class Truck extends Vehicle{
	
	protected double loadCapacity;
	
	public Truck(String model, String licensePlate, double dailyRate, double loadCapacity) {
		super(model, licensePlate, dailyRate);
		this.loadCapacity = loadCapacity;
	}
	
	
	
	/*Rental Price based on load capacity of the truck in tons
	 * 0.5 - 1.5 tons: $100	
	 * 5 - 13 tons: $200
	 * 20 - 40 tons: $400*/
	
	@Override
	public double calculateRentalPrice(int days) {
		
		if(loadCapacity >= 0.5 && loadCapacity <= 1.5) {
			return (dailyRate * days) + 100;
		}
		else if(loadCapacity >= 5 && loadCapacity <= 13) {
			return (dailyRate * days) + 200;
		}
		else {
			return (dailyRate * days) + 400;
		}
		
	}
	
}
