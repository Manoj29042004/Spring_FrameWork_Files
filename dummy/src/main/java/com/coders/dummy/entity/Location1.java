package com.coders.dummy.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Location1 implements Location { 
	@Value("kphb")
	private String city;
	public Location1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location1(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Location1 [city=" + city + "]";
	}
	
}
