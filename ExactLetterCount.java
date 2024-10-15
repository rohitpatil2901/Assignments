package Assignments;

public class ExactLetterCount {

	public static void main(String[] args) {
	
		String str="kvs no 2";
		int count=0;
		
		
		
		for(int i=0;i<str.length();i++) {
			char letter=str.charAt(i);
			
			if(Character.isLetter(letter)) {
				count++;
			}
		}
		
		System.out.println("Number of letters: "+count);
		
		

	}

}
