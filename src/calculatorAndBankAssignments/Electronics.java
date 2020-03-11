package calculatorAndBankAssignments;

import java.util.Scanner;

public class Electronics {
	
	static double regularPrice;
	static double salePrice;
	String manufacturer;
	
	static void computeSalePrice () {
		Scanner price = new Scanner(System.in);
		System.out.println("Enter the regular price: ");
		regularPrice = price.nextDouble();
		
		salePrice = regularPrice * 0.6;
		System.out.println("Due to offer, you will only pay "+salePrice+" for this.");
	}
	public static void main(String[] args) {
	
		computeSalePrice();
		
	}

}
