package Assignments;

import java.util.Arrays;

public class UpdateArrayValue {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		String before=arr.toString();
		System.out.println("Array Before updation of value: "+Arrays.toString(arr));
		
		arr[1]=23;
		String after=arr.toString();
		System.out.println("Array After updation of value: "+Arrays.toString(arr));
	}

}
