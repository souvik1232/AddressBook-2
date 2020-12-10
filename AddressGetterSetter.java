package com.java.addressbook2;

import java.util.Comparator;

public class AddressGetterSetter {
	
	String fname;
	String lname;
	String address;
	String state;
	String city;
	String zip;
	String phone;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public static Comparator<AddressGetterSetter> NameComparator = new Comparator<AddressGetterSetter>() {

		public int compare(AddressGetterSetter a1, AddressGetterSetter a2) {
		   String Name1 = a1.getFname().toUpperCase();
		   String Name2 = a2.getFname().toUpperCase();

		  
		   return Name1.compareTo(Name2);
		}
	};
	@Override
	public String toString() {
		return "AddressGetterSetter [fname=" + fname + ", lname=" + lname + ", address=" + address + ", state=" + state
				+ ", city=" + city + ", zip=" + zip + ", phone=" + phone + "]";
	}
	
	

}
