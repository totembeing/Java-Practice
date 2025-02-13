package com.vehiclerentas;

//Utility class to perform operations on objects of Vehicle class
public class RentalService {

	
	public void rentalReport(Vehicle vehicle, int days) {
		vehicle.displayDetails();
		System.out.printf("| Rental price for %d day: %.2f", days, vehicle.calculateRentalPrice(days));
		System.out.println();
	}
	
}
