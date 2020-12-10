package com.java.addressbook2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import java.util.Set;



public class AddressService implements IAddress {
	
	ArrayList<AddressGetterSetter> book =new ArrayList<>();
	HashMap<String, String> citydict = new HashMap<String, String>();
	HashMap<String, String> statedict = new HashMap<String, String>();
	Scanner s = new Scanner(System.in);
	
	
	@Override
	public void Add() {

		AddressGetterSetter Info = new AddressGetterSetter();
		System.out.println("Enter First name:");
		Info.setFname(s.next());
		System.out.println("Enter last name:");
		Info.setLname(s.next());
		System.out.println("Enter your address:");
		Info.setAddress(s.next());
		System.out.println("Enter your city:");
		Info.setCity(s.next());
		System.out.println("Enter your state:");
		Info.setState(s.next());
		System.out.println("Enter your ZIP code:");
		Info.setZip(s.nextInt());
		System.out.println("Enter your phone number");
		Info.setPhone(s.next());
		citydict.put(Info.getCity(), Info.getFname());
		statedict.put(Info.getState(), Info.getFname());
		
		for(int i =0;i<book.size();i++) {
			if(book.get(i).getFname().equals(Info.getFname())) {
				if(book.get(i).getLname().equals(Info.getLname())) {
					System.out.println("Duplicate");
					break;
				}
			}
			else {
				book.add(Info);
				break;
			}	
		}
		if(book.size()==0)
			book.add(Info);	
	}


	@Override
	public void Edit() {

		String temp=null;
		System.out.println("Enter the Phone number of the record u want to Edit");
		temp=s.next();
		if(book.isEmpty())
		{
			System.out.println("No records to edit");
			return;
		}
		
			for(int i=0;i<book.size();i++)
			{
				if(book.get(i).getPhone().equals(temp))
				{
					AddressGetterSetter Info=new AddressGetterSetter();
					System.out.println(temp);
					System.out.println("Enter First name:");
					Info.setFname(s.next());
					System.out.println("Enter last name:");
					Info.setLname(s.next());
					System.out.println("Enter your address:");
					Info.setAddress(s.next());
					System.out.println("Enter your city:");
					Info.setCity(s.next());
					System.out.println("Enter your state:");
					Info.setState(s.next());
					System.out.println("Enter your ZIP code:");
					Info.setZip(s.nextInt());
					System.out.println("Enter your phone number");
					Info.setPhone(s.next());
					book.remove(i);
					book.add(i, Info);
					break;
				}
				
			}
	}


	@Override
	public void Delete() {

		String temp=null;
		System.out.println("Enter the First name of the record you want to delete");
		temp=s.next();
		if(book.isEmpty())
		{
			System.out.println("No records to delete");
			return;
		}
		for(int i=0;i<book.size();i++)
		{
			if(book.get(i).getFname().equals(temp))
			{
				book.remove(i);
				break;
			}
		}
	}


	@Override
	public void SortName() {

		Collections.sort(book, AddressGetterSetter.NameComparator);
	}


	@Override
	public void SortCity() {
		Collections.sort(book, AddressGetterSetter.CityComparator);
	}


	@Override
	public void SortState() {
		Collections.sort(book, AddressGetterSetter.StateComparator);
	}


	@Override
	public void SortZip() {
		Collections.sort(book, AddressGetterSetter.ZipComparator);
	}


	@Override
	public void Display() {

		for(int i=0;i<book.size();i++)
		{
			System.out.println(book.get(i));
		}
	}


	@Override
	public void DisplayCity() {

		Set set = citydict.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("City is: "+ mentry.getKey() + " & Name is: ");
	         System.out.println(mentry.getValue());
	      }
	}


	@Override
	public void DisplayState() {

		Set set = statedict.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("State is: "+ mentry.getKey() + " & Name is: ");
	         System.out.println(mentry.getValue());
	      }
	}
	
	

	
}
