package coreJavaAssignments;

public class Customer {
	
	static double custId;
	static double custName;
	protected long custCon;
	
	static void print () {
		custId = Math.random();
		custName = Math.random();
		System.out.println(custId);
		System.out.println(custName);
	}
	
	public static void main(String[] args) {
		print();
	}

}
