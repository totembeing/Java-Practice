package com.vehiclerentas;

import java.util.ArrayList;

public class Main {

	public double rentalPrice;
	
	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Truck("Ford F-150", "TRK123", 100, 5));
		vehicles.add(new Car("Toyota Campry", "CAR789", 50, 5));
		vehicles.add(new Motorcycle("Harley-Davidson Sportser", "MC202", 30, 1000));
		
		//Creating object for RentalService class
		RentalService rental = new RentalService();
		
		for(Vehicle vehicle: vehicles) {
			rental.rentalReport(vehicle, 5);
			
		}
	}
	
}
