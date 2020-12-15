package com.java.addressbook2;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book!");
		
		int  input;
		int ans;
		AddressService addressService = new AddressService();
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1.Add a contact");
			System.out.println("2.Edit a contact");
			System.out.println("3.Delete a contact");
			System.out.println("4.Sort by First Name");
			System.out.println("5.Sort by City"); 
			System.out.println("6.Sort by State");
			System.out.println("7.Sort by Zip");
			System.out.println("8.Display");
			System.out.println("9.Display City wise");
			System.out.println("10.Display State wise");
			System.out.println("11.Search City/State wise");
			input = scanner.nextInt();
			switch(input)
			{
			case 1:
				addressService.add();
				break;
			case 2:
				addressService.edit();
				break;
			case 3:
				addressService.delete();
				break;
			case 4:
				addressService.sortName();
				break;
			case 5:
				addressService.sortCity();
				break;
			case 6:
				addressService.sortState();
				break;
			case 7:
				addressService.sortZip();
				break;
			case 8:
				addressService.display();
				break;
			case 9:
				addressService.displayCity();
				break;
			case 10:
				addressService.displayState();
				break;
			case 11:
				addressService.search();
				break;
			default:System.out.println("Invalid option");
			}
			System.out.println("Do you want to continue?(0/1)");
			ans=scanner.nextInt();
		}while(ans==1); 
		scanner.close();
	}
}
