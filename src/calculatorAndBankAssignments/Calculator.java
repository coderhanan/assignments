package calculatorAndBankAssignments;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner uservalues = new Scanner (System.in);
		System.out.println("Enter first and second value");
		
		double value1 = uservalues.nextDouble();
		double value2 = uservalues.nextDouble();
		
		Scanner useroperator = new Scanner (System.in);
		System.out.println("Choose an operator");
		
		char operator = useroperator.next().charAt(0);
		
		double result;
		
		switch(operator) 
		{
			case '+':
				result = value1 + value2;
				break;
				
			case '-':
				result = value1 - value2;
				break;
			
			case '*':
				result = value1 * value2;
				break;
				
			case '/':
				result = value1 / value2;
				break;
				
			default:
				System.out.println("Invalid Operator");
				return;
			
		}
		
		System.out.println("Answer to your query is "+result+". "+"This is based on: "+value1+" "+operator+" "+value2+" = "+result);
		
	}

}
