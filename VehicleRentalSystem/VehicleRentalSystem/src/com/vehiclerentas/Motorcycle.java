package com.vehiclerentas;

//Sub-class of Vehicle
public class Motorcycle extends Vehicle{

	protected int engineCapacity;
	
	public Motorcycle(String model, String licensePlate, double dailyRate, int engineCapacity) {
		super(model, licensePlate, dailyRate);
		this.engineCapacity = engineCapacity;
	}
	
	/*Rental price based on engine capacity
	 * 50cc - 125cc: $30
	 * 125cc - 500cc: $40
	 * 500cc - 900cc: $50*/
	
	@Override
	public double calculateRentalPrice(int days) {
		
		if(engineCapacity >= 50 && engineCapacity <= 125) {
			return (dailyRate * days) + 30;
		}
		else if(engineCapacity > 125 && engineCapacity < 500) {
			return (dailyRate * days) + 40;
		}
		else {
			return (dailyRate * days) + 50;
		}
		
	}
	
}
