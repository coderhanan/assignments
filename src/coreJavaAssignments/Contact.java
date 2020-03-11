package coreJavaAssignments;

import java.util.Scanner;

public class Contact extends Customer{
		static void custContact () {
			Scanner cusCon = new Scanner (System.in);
			System.out.println("Enter your contact number");
			long custCon = cusCon.nextLong();
			System.out.println(custCon);
		}
		
		public static void main(String[] args) {
			custContact();
		}
}
