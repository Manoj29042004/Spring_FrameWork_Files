//package com.coders.demo.entity;
//
//import org.springframework.beans.factory.annotation.Value;
//
//public class Location2 implements Location{
//	
//	@Value("2")
//	private int lid;
//	@Value("Hyderabad")
//	private String city;
//
//	public Location2() {
//    	super();
//    	System.out.println("no parameterized constructor");
//    }
//	
//	 public Location2(int lid, String city) {
//	    	super();
//	    	this.lid = lid;
//	    	this.city = city;
//	    	System.out.println("Parameterized Constructor");
//	    }
//	 
//	public int getLid() {
//		return lid;
//	}
//	public void setLid(int lid) {
//		this.lid = lid;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	@Override
//	public String toString() {
//		return "Location [lid=" + lid + ", city=" + city + "]";
//	}
//
//}
//
