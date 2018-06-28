package com.cogn.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Car")
public class Car extends Vehicle {
	
	private int noOfWheels;
	
	private String noOfSeats;
	
	public Car() {
	}

	public Car(String manufacturer, String licenceNo, int capacity, int noOfWheels, String noOfSeats) {
		super(manufacturer, licenceNo, capacity);
		this.noOfWheels = noOfWheels;
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(String noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
}
