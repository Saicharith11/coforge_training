package com.coforge.model;

public class DeliveryAddress {
	private String city;
	private String State;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "DeliveryAddress [city=" + city + ", State=" + State + "]";
	}
	public DeliveryAddress(String city, String state) {
		super();
		this.city = city;
		State = state;
	}
	public DeliveryAddress() {
		
	}
}