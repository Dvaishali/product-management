package com.zensar.spring_annotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address2 implements IAddress{
	
	@Value("${state}")
	private String state;
	@Value("${city}")
	private String city;
	@Value("${pincode}")
	private int pincode;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address2 [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public Address2(String state, String city, int pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		
		System.out.println("Address2(String state, String city, int pincode)");
	}
	public Address2() {
		super();
	}

	
}
