package com.coders.dummy.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Location2 implements Location { 
	@Value("Vijayawada")
	private String city;
	public Location2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location2(String city) {
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
		return "Location2 [city=" + city + "]";
	}
	
}
