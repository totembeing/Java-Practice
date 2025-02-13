package com.vehiclerentas;

public abstract class Vehicle {

	//Instance variables
	public String model;
	protected String licensePlate;
	protected double dailyRate;
	
	//Constructor to initialize instance variables
	public Vehicle(String model, String licensePlate, double dailyRate) {
		this.model = model;
		this.licensePlate = licensePlate;
		this.dailyRate = dailyRate;
	}
	
	//Abstract method
	public abstract double calculateRentalPrice(int days);
	
	//Method to display vehicle details
	public void displayDetails() {
		System.out.printf("Vehice Model: %s | Vehicle License Plate: %s | Vehicle Daily Rate: %.2f ", model, licensePlate, dailyRate);
	}
}
