package assignment2;

import java.util.Scanner;

public class AddSubMulDivSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double num1,num2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=sc.nextDouble();
		
		System.out.println("Enter second number");
		num2=sc.nextDouble();
		
		System.out.println("Select an operation to perform: ");
		System.out.println("1:addition");
		System.out.println("2:substraction");
		System.out.println("3: multiplication");
		System.out.println("4: division");
		
		System.out.println("enter your choice: ");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1://addition
			System.out.println("Addition is: "+ (num1+num2));
			break;
			
		case 2://substraction
			System.out.println("Substraction is: "+(num1-num2));
			
		case 3://multiplication
			System.out.println("Multiplication is: "+(num1*num2));
			
		case 4://division
			if(num2 !=0) {
				System.out.println("Division: "+num1/num2);
			}
			else {
				System.out.println("Error: division by zero not allowed");
			}
			break;
			
			default:
				System.out.println("Invalid choice: Plz select valid option");
				break;
		}
		
		sc.close();
		
	}

}
