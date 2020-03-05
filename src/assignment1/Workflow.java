package assignment1;

import java.util.Scanner;

public class Workflow {

	public static void main(String[] args) {
				
		Scanner userinput = new Scanner (System.in);
		System.out.println("Please enter a number");
		int casenumber = userinput.nextInt();
		
		switch(casenumber){
		case 1:
			System.out.println("This is case 1");
			break;
		case 2:
			System.out.println("This is case 2");
			break;
		case 3:
			System.out.println("This is case 3");
			break;
		default:
			System.out.println("This is default");
			
		}
	
		int min = -128;
		int max = 127;
		int add = min+max;
		
		System.out.println("int data range is from "+min+" to "+max+" and adding them together gives us "+add);
	}
	

}
