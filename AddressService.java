package com.java.addressbook2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class AddressService implements IAddress {
	
	ArrayList<Address> book =new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	
	@Override
	public void add() {

		Address addressService = new Address();
		System.out.println("Enter First name:");
		addressService.setFirstName(scanner.next());
		System.out.println("Enter last name:");
		addressService.setLastName(scanner.next());
		System.out.println("Enter your address:");
		addressService.setAddress(scanner.next());
		System.out.println("Enter your city:");
		addressService.setCity(scanner.next());
		System.out.println("Enter your state:");
		addressService.setState(scanner.next());
		System.out.println("Enter your ZIP code:");
		addressService.setZip(scanner.nextInt());
		System.out.println("Enter your phone number");
		addressService.setPhone(scanner.next());
		
		
		for(int i =0;i<book.size();i++) {
			if(book.get(i).getFirstName().equals(addressService.getFirstName())) {
				if(book.get(i).getLastName().equals(addressService.getLastName())) {
					System.out.println("Duplicate");
					break;
				}
			}
			else {
				book.add(addressService);
				break;
			}	
		}
		if(book.size()==0)
			book.add(addressService);	
	}


	@Override
	public void edit() {

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
					Address address=new Address();
					System.out.println(temp);
					System.out.println("Enter First name:");
					address.setFirstName(scanner.next());
					System.out.println("Enter last name:");
					address.setLastName(scanner.next());
					System.out.println("Enter your address:");
					address.setAddress(scanner.next());
					System.out.println("Enter your city:");
					address.setCity(scanner.next());
					System.out.println("Enter your state:");
					address.setState(scanner.next());
					System.out.println("Enter your ZIP code:");
					address.setZip(scanner.nextInt());
					System.out.println("Enter your phone number");
					address.setPhone(scanner.next());
					book.remove(i);
					book.set(i, address);
					break;
				}
				
			}
	}


	@Override
	public void delete() {

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
	public void sortName() {

		Collections.sort(book, ComparatorMethod.nameComparator);
	}


	@Override
	public void sortCity() {
		Collections.sort(book, ComparatorMethod.cityComparator);
	}


	@Override
	public void sortState() {
		Collections.sort(book, ComparatorMethod.stateComparator);
	}


	@Override
	public void sortZip() {
		Collections.sort(book, ComparatorMethod.zipComparator);
	}


	@Override
	public void display() {

		for(int i=0;i<book.size();i++)
		{
			System.out.println(book.get(i));
		}
	}


	@Override
	public void displayCity() {
		for(int i=0;i<book.size();i++) {
			System.out.println("City is "+book.get(i).getCity()+"& Name is: "+book.get(i).getFirstName());
		}
	}


	@Override
	public void displayState() {
		for(int i=0;i<book.size();i++) {
			System.out.println("State is "+book.get(i).getState()+" & Name is: "+book.get(i).getFirstName());
		}
	}
	
	@Override
	public void search() {
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