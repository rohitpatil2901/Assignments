package Assignments;

public class TwoArraysEqua {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean isSame=true;
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,4,5};
		
		
		for(int i=0;i<arr1.length;i++) {
			
			if(arr1[i]!=arr2[i]) {
				
				isSame=false;
				break;
			}		
					
			}
			
			if(isSame) {
				System.out.println("Both arrays same");
			}
			
			else {
				
				System.out.println("Both arrays not same");
			}
				
			}
		
		}
		
		
	


