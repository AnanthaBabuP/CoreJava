package com.Aggregation;

public class Address {
	String city;
	String state;
	String country;
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
	
	
}
