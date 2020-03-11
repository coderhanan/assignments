package calculatorAndBankAssignments;

import java.util.Scanner;

public class TaxCalculator {
	
	static double annualIncome;
	static double investedAmount;
	static String gender;
	static Long panNumber;
	
	static void taxCalculations () {
	Scanner income = new Scanner (System.in);
	System.out.println("Enter your gross annual income: ");
	annualIncome = income.nextDouble();
	
	Scanner invested = new Scanner (System.in);
	System.out.println("Enter value of your investments: ");
	investedAmount = invested.nextDouble();
	
	double taxableAmount = annualIncome - investedAmount;
	
	if (taxableAmount <= 2000) {
		double tax = taxableAmount * 0;
		System.out.println("Your taxable amount is below minimum threshold, hence you do not pay any tax.");
	} else if (taxableAmount >= 2001 && taxableAmount <= 5000) {
		double tax = taxableAmount * 2/100;
		System.out.println("Your tax due is "+tax);
	} else if (taxableAmount >= 5001 && taxableAmount <= 10000) {
		double tax = 60.00 + (taxableAmount * 4/100);
		System.out.println("Your tax due is "+tax);
	} else if (taxableAmount >= 100001 && taxableAmount <= 150000) {
		double tax = 260 + (taxableAmount * 6/100);
		System.out.println("Your tax due is "+tax);
	} else if (taxableAmount >= 15001 && taxableAmount <= 20000) {
		double tax = 560 + (taxableAmount * 8/100);
		System.out.println("Your tax due is "+tax);
	} else if (taxableAmount >= 20001 && taxableAmount <= 30000) {
		double tax = 960 + (taxableAmount * 10/100);
		System.out.println("Your tax due is "+tax);
	} else if (taxableAmount >= 30001 && taxableAmount <= 50000) {
		double tax = 1960 + (taxableAmount * 12.5/100);
		System.out.println("Your tax due is "+tax);
	} else if (taxableAmount >= 15000) {
		double tax = 4460 + (taxableAmount * 15/100);
		System.out.println("Your tax due is "+tax);
	}else {
		System.out.println("You are a lucky tax exempted individual.");
	}
	
	}

	public static void main(String[] args) {
		taxCalculations();
	}

}
