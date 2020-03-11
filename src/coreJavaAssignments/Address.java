package coreJavaAssignments;

import java.util.Scanner;

public class Address extends Customer {
	
	private String address;
	
	static void custAdd () {
		
		Scanner adrs = new Scanner (System.in);
		System.out.println("Enter first line of address");
		String address = adrs.next();
	}
	
	public static void main(String[] args) {
		custAdd();
		
	}
}
