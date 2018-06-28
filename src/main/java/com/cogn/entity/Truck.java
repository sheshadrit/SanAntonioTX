package com.cogn.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Truck")
public class Truck extends Vehicle{
	

	private int noOfWheels;
	
	private int noOfSeats;
	
	public Truck() {
	}

	public Truck(String manufacturer, String licenceNo, int capacity, int noOfWheels, int noOfSeats,
			String manufacturingType) {
		super(manufacturer, licenceNo, capacity);
		this.noOfWheels = noOfWheels;
		this.noOfSeats = noOfSeats;
		this.manufacturingType = manufacturingType;
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getManufacturingType() {
		return manufacturingType;
	}

	public void setManufacturingType(String manufacturingType) {
		this.manufacturingType = manufacturingType;
	}

	private String manufacturingType;

}
