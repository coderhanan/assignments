package calculatorAndBankAssignments;

public class Circle {

	static double radius;
	
	static void area(double length, double width) {
		
		double squareArea = length * width;
		double circleArea = (Math.PI/4) * Math.pow(squareArea, 2.0);
		radius = Math.sqrt(circleArea/Math.PI);
		System.out.println(radius);
	}
	public static void main(String[] args) {
		area(10.5,11.89);
	}

}
