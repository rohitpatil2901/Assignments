package Assignments;

public class FindValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		int value=5;
		boolean isfound=false;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==value) {
				System.out.println("Value found: "+value);
				isfound=true;
				break;
			}
			}
			if(!isfound) {
				System.out.println("Value not found: "+value);
			}
			
		}
		
	}


