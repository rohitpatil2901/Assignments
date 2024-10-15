package Assignments;

public class ReplaceAllCapitallettersWithNothing {

	public static void main(String[] args) {
		String name="I am the Boss",nStr="";
		nStr=nStr+name.replaceAll("[A-Z]", "");
		System.out.println(nStr);
		

	}

}
