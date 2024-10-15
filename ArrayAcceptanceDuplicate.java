package Assignments;

public class ArrayAcceptanceDuplicate {
	
	
	public static boolean isArrayDuplicate(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		
		
		return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,4};
		
		if(isArrayDuplicate(arr)) {
			
			System.out.println("Array contains duplicate values");
		}
		else {
			System.out.println("Array doesn't contains duplicate values");
		}
		
	}

}
