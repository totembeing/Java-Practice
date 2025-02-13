package com.vehiclerentas;

//Sub-class of Vehicle 
public class Car extends Vehicle{
	
	//Instance variable for the Car class
	protected int numSeats;
	protected double calculatedRent;
	
	public Car(String model, String licensePlate, double dailyRate, int numSeats) {
		super(model, licensePlate, dailyRate);
		this.numSeats = numSeats;
	}
	
	
	/*Rental price based on number of seats
	 * Min seats: 4
	 * Max seats: 7*/
	
	@Override
	public double calculateRentalPrice(int days) {
		
		/*4 seater: $30
		 *5 seater: $35
		 *6 seater: $40
		 *7 seater: $45*/
		
		switch(numSeats) {
		case 4:
			calculatedRent = (dailyRate * days) + 30;
			break;
		case 5:
			calculatedRent = (dailyRate * days) + 35;
			break;
		case 6:
			calculatedRent = (dailyRate * days) + 40;
			break;
		case 7: 
			calculatedRent = (dailyRate * days) + 45;
			break;
		default:
			System.out.println("Unknow Error!");
		}
		
		return calculatedRent;
		
	}
	

}
