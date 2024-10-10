package Assignments;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Rohit", revStr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
			
		}
		System.out.println("Original String: "+str);
		System.out.println("String after reverse operation: "+revStr);
	}

}
