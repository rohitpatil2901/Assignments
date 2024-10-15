package Assignments;

public class EqualIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Rohit";
		String str1="Rohit";
		boolean flag=false;
		
		if(str.equalsIgnoreCase(str1)) {
			flag=true;
			
		}
		
		if(!flag) {
			System.out.println("both strings are not same");
		
		}
		else {
			System.out.println("both strings are same");
		}
		
		
	}

}
