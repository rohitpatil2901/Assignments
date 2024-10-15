package Assignments;

public class ArrayStoresNull {
	
	
	public static boolean isArrayStoreNull(Object arr[]) {
		
		
		for(Object element:arr) {
			if(element==null) {
				return true;
			}
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object arr[]= {1,"two", null, 45};
		if(isArrayStoreNull(arr)) {
			System.out.println("Array stores null value");
		}
		else {
			System.out.println("Array doesn't stores null value");
		}
		
		
	}

}
