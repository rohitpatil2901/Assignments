package Assignments;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str="MADAM",orgStr=str,revStr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
		}
		
		if(revStr.equals(orgStr)){
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
