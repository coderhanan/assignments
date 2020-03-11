package calculatorAndBankAssignments;

import java.util.Scanner;

public class AvergeMarks {
	
	static String studentName;
	static Long rollNo;
	static double ec1Marks;
	static double ec2Marks;
	static double ec3Marks;
	
	public static void average () {
		Scanner name = new Scanner (System.in);
		System.out.println("Enter student name: ");
		studentName = name.next();
		
		Scanner id = new Scanner (System.in);
		System.out.println("Enter student roll no: ");
		rollNo = id.nextLong();
		
		Scanner exam1 = new Scanner (System.in);
		System.out.println("Enter marks for first exam: ");
		ec1Marks = exam1.nextDouble();

		Scanner exam2 = new Scanner (System.in);
		System.out.println("Enter marks for second exam: ");
		ec2Marks = exam2.nextDouble();

		Scanner exam3 = new Scanner (System.in);
		System.out.println("Enter marks for third exam: ");
		ec3Marks = exam3.nextDouble();
		
		double totalmarks = ec1Marks + ec2Marks + ec3Marks;
		double averageMarks = totalmarks / 3;
		
		
		
		System.out.println(studentName+"'s average score is "+Math.round(averageMarks));
		if (averageMarks >= 50) {
			System.out.println(studentName+" has passed.");
		}
		else {
			System.out.println(studentName+" failed to pass the exam.");
		}
	}

	public static void main(String[] args) {
		average();
	}

}
