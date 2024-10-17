package Assignments;

public class ReverseRAMWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="RAM";
		
		for(int i=0;i<str.length();i++) {
			char str1=str.charAt(i);
			System.out.println(str1);
		}	
		
		System.out.println("Second Output:");
		for(int j=str.length()-1;j>=0;j--){
			

			System.out.println(str.charAt(j));
			
		}
			
		}
	}


