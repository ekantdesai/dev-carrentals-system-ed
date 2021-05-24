package com.conflowence.training;

public class CarRental implements java.io.Serializable, Comparable<CarRental>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 892813256732761836L;
	
	String pickupLocation;
	String dropoffLocation;
	String rentDate;
	double price;
	int carTotalSeats;
	String carBrand;
	String company;
	
	public CarRental() {
		
	}
	
	public CarRental(String pickupLocation, String dropoffLocation, double price ) {
		this.pickupLocation = pickupLocation;
		this.dropoffLocation = dropoffLocation;
		this.price = price;
	}
	
	public CarRental(String pickupLocation, String dropoffLocation, double price, int carTotalSeats) {
		this(pickupLocation, dropoffLocation, price);
		this.carTotalSeats = carTotalSeats;
	}
	
	public CarRental(String pickupLocation, String dropoffLocation, double price, int carTotalSeats, String carBrand) {
		this(pickupLocation, dropoffLocation, price, carTotalSeats);
		this.carBrand = carBrand;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropoffLocation() {
		return dropoffLocation;
	}

	public void setDropoffLocation(String dropoffLocation) {
		this.dropoffLocation = dropoffLocation;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCarTotalSeats() {
		return carTotalSeats;
	}

	public void setCarTotalSeats(int carTotalSeats) {
		this.carTotalSeats = carTotalSeats;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int compareTo(CarRental o) {
		int value = Double.compare(this.getPrice(), o.getPrice());
		return value;
	}
	
}	