package com.coforge.day4.abstraction;

public class VehicleApp {

	public static void main(String[] args) {
		/*Bike ch = new Bike();
		
		ch.noOfWheels();
		ch.brandName();
		ch.noOfEngine();
		*/
		
		VehiclePlan vehicle;
		vehicle = new Bike();
		
		vehicle.numberOfWheel();
		vehicle.numberOfEngine();
		vehicle.brandName();

	}

}
