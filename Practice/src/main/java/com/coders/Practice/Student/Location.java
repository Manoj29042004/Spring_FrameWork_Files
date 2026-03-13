package com.coders.Practice.Student;

public class Location {
		private int locid;
		private int pincode;
		private String city;
		public int getLocid() {
			return locid;
		}
		public void setLocid(int locid) {
			this.locid = locid;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Location [locid=" + locid + ", pincode=" + pincode + ", city=" + city + "]";
		}

}
