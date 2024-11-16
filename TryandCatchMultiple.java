package assignments3;

import java.util.Scanner;

public class TryandCatchMultiple {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		try {
			
			System.out.print("Enter a numerator(Integer)");
			int numerator=sc.nextInt();
			
			System.out.print("Enter a denominator(Integer)");
			int denominator=sc.nextInt();
			
			int result=numerator/denominator;
			System.out.println("division of two values is :"+ result);
			
			int [] array= {10,20,30};
			System.out.println("Enter an index to access array: ");
			int index=sc.nextInt();
			System.out.println("Array element: "+ array[index]);
		}
		catch(ArithmeticException e){
			System.out.println("Error: division by zero is not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index is out of bound");
		}
		catch(Exception e) {
			System.out.println("Error: An unexpected exception occurred.");
		}
		finally {
		sc.close();
		System.out.println("program ended");
		}
		}

}
