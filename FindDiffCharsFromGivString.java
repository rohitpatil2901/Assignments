package Assignments;

import java.util.Scanner;

public class FindDiffCharsFromGivString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input=sc.nextLine();
		
		String alphabets="", digits="",spaces="",specialChars="";
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
		
		
		if(Character.isLetter(ch)) {
			alphabets += ch;
		}
		
		else if(Character.isDigit(ch)) {
			digits += ch;
		}
		
		else if(Character.isWhitespace(ch)) {
			spaces += ch;
		}
		
		else {
			specialChars += ch;
		}
		}
		
		System.out.println("Alphabets: "+alphabets);
		System.out.println("Digits: "+digits);
		System.out.println("Spaces: "+spaces);
		System.out.println("Special Characters: "+specialChars);
		sc.close();
		
		
	}

}
