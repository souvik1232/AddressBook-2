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
	Scanner scanner = new Scanner(System.in);
	
	
	@Override
	public void Add() {

		AddressGetterSetter Info = new AddressGetterSetter();
		System.out.println("Enter First name:");
		Info.setFirstName(scanner.next());
		System.out.println("Enter last name:");
		Info.setLastName(scanner.next());
		System.out.println("Enter your address:");
		Info.setAddress(scanner.next());
		System.out.println("Enter your city:");
		Info.setCity(scanner.next());
		System.out.println("Enter your state:");
		Info.setState(scanner.next());
		System.out.println("Enter your ZIP code:");
		Info.setZip(scanner.nextInt());
		System.out.println("Enter your phone number");
		Info.setPhone(scanner.next());
		
		
		for(int i =0;i<book.size();i++) {
			if(book.get(i).getFirstName().equals(Info.getFirstName())) {
				if(book.get(i).getLastName().equals(Info.getLastName())) {
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
		temp=scanner.next();
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
					Info.setFirstName(scanner.next());
					System.out.println("Enter last name:");
					Info.setLastName(scanner.next());
					System.out.println("Enter your address:");
					Info.setAddress(scanner.next());
					System.out.println("Enter your city:");
					Info.setCity(scanner.next());
					System.out.println("Enter your state:");
					Info.setState(scanner.next());
					System.out.println("Enter your ZIP code:");
					Info.setZip(scanner.nextInt());
					System.out.println("Enter your phone number");
					Info.setPhone(scanner.next());
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
		temp=scanner.next();
		if(book.isEmpty())
		{
			System.out.println("No records to delete");
			return;
		}
		for(int i=0;i<book.size();i++)
		{
			if(book.get(i).getFirstName().equals(temp))
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
		for(int i=0;i<book.size();i++) {
			System.out.println("City is "+book.get(i).getCity()+"& Name is: "+book.get(i).getFirstName());
		}
	}


	@Override
	public void DisplayState() {
		for(int i=0;i<book.size();i++) {
			System.out.println("State is "+book.get(i).getState()+" & Name is: "+book.get(i).getFirstName());
		}
	}
	
	@Override
	public void Search() {
		System.out.println("Search Preferance:1.City  2.State");
		int input = scanner.nextInt();
		if(input == 1) {
			String temp=null;
			System.out.println("Enter the City whose record u want to display");
			temp=scanner.next();
			if(book.isEmpty())
			{
				System.out.println("No records to Show");
				return;
			}

			for(int i=0;i<book.size();i++)
			{
				if(book.get(i).getCity().equals(temp))
				{
					System.out.println(book.get(i).getFirstName());
				}
			}
		}
		else {
			String temp=null;
			System.out.println("Enter the State whose record u want to display");
			temp=scanner.next();
			if(book.isEmpty())
			{
				System.out.println("No records to Show");
				return;
			}

			for(int i=0;i<book.size();i++)
			{
				if(book.get(i).getState().equals(temp))
				{
					System.out.println(book.get(i).getFirstName());
				}
			}
		}
		
	}
	
	
		
	
}
