package calculatorAndBankAssignments;


public class Bank {
	
	static long accountNo = 123456789;
	static double balance = 100;
	static int action;
	
	
	
	static void welcome () {
		System.out.println("Hi, welcome to Hanan Bank. Where we don't do things differently.");
		System.out.println("Your account number is "+accountNo);
		System.out.println("Your current balance is: "+balance);
	}
	 
	static void deposit (double deposition) {
		balance += deposition;
		System.out.println("After deposit of "+deposition+" your new balance is "+balance);
		System.out.println("Your current balance is "+balance);
	}
	
	static void withdraw (double withdrawal) {
		balance -=  withdrawal;
		System.out.println("After withdrawing "+withdrawal+" your balance is "+balance);
	}
	
	
	
	
	public static void main(String[] args) {
		welcome();
		deposit(1000000);
		withdraw(2000);
		
	}
}
