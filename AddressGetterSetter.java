package com.java.addressbook2;

import java.util.Comparator;

public class AddressGetterSetter {
	
	String firstName;
	String lastName;
	String address;
	String state;
	String city;
	int zip;
	String phone;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstname) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastName;
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
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
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
		   String Name1 = a1.getFirstName().toUpperCase();
		   String Name2 = a2.getFirstName().toUpperCase();

		  
		   return Name1.compareTo(Name2);
		}
	};
	
	
	public static Comparator<AddressGetterSetter> CityComparator = new Comparator<AddressGetterSetter>() {

		public int compare(AddressGetterSetter a1, AddressGetterSetter a2) {
		   String Name1 = a1.getCity().toUpperCase();
		   String Name2 = a2.getCity().toUpperCase();

		  
		   return Name1.compareTo(Name2);
		}
	};
	
	
	public static Comparator<AddressGetterSetter> StateComparator = new Comparator<AddressGetterSetter>() {

		public int compare(AddressGetterSetter a1, AddressGetterSetter a2) {
		   String Name1 = a1.getState().toUpperCase();
		   String Name2 = a2.getState().toUpperCase();

		  
		   return Name1.compareTo(Name2);
		}
	};
	
	
	public static Comparator<AddressGetterSetter> ZipComparator = new Comparator<AddressGetterSetter>() {

		public int compare(AddressGetterSetter a1, AddressGetterSetter a2) {
		   int Zip1 = a1.getZip();
		   int Zip2 = a2.getZip();
		  
		   return Zip1-Zip2;
		}
	};
	
	@Override
	public String toString() {
		return "AddressGetterSetter [firstname=" + firstName + ", lastname=" + lastName + ", address=" + address + ", state=" + state
				+ ", city=" + city + ", zip=" + zip + ", phone=" + phone + "]";
	}
	
	

}
