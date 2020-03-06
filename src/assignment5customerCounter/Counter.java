package assignment5customerCounter;

public class Counter {

	int custCount;
	
	public static void main(String[] args) {
		
		Counter myObj = new Counter();
		myObj.customer();
	}
	
	void customer () {
		for (custCount = 0; custCount <= 10; custCount++ ) {
			System.out.println(custCount);
		}
		
	}

}
