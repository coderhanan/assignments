package assignment5customerCounter;

import java.util.Scanner;

public class Phones {

	static int maxPhones = 0;
	
	public static void main(String[] args) {
		
		Phones myObj = new Phones(maxPhones);
		System.out.println(myObj.maxPhones);
		
		
		

	}
	
	public Phones (int maxPhones) {
		this.maxPhones = maxPhones;
		Scanner phonenum = new Scanner (System.in);
		System.out.println("Number of phone this user is allowed");
	}

}
