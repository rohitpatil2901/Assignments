package Assignments;

public class FindLetterStartWithCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My name is Rohit";
		if(str.trim().startsWith("M")|| str.contains("M")) {
			System.out.println("String contains word that start with capital M");
		}
		else {
			System.out.println("Word not found which start with M");
		}
	}

}
