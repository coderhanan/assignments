package assignment4Customer;

public class Customer {
	
	private String address = null;
			int address2 = 0;
	protected String contact = null;
	public float phone = 0.0f;
	
	void cust () {
		long custID = 13256;
		String custName = "Software Engineer";
		System.out.println(custID);
		System.out.println(custName);
	}
	

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.cust();
		c.custDetails();
	}
	
	void custDetails () {
		
		address = "this is an address";
		contact = "this is a contact";
		System.out.println(address);
		System.out.println(contact);
	}
	
	

}
