package com.coders.demo.entity;

//public interface Location{
//	
//}

import org.springframework.beans.factory.annotation.Value;

public class Location {
	
//	@Value("1")
	private int lid;
//	@Value("Bangalore")
	private String city;
	
	public Location() {
    	super();
    	System.out.println("no parameterized constructor");
    }
	
	 public Location(int lid, String city) {
	    	super();
	    	this.lid = lid;
	    	this.city = city;
	    	System.out.println("Parameterized Constructor");
	    }
	 
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Location [lid=" + lid + ", city=" + city + "]";
	}

}
