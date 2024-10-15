package Assignments;

public class ReplaceNumericsWithNothing {

	public static void main(String[] args) {
		String Str="My home is near to sector 2 Patna 4",nStr="";
		nStr=nStr+Str.replaceAll("[0-9]", "");
		System.out.println(nStr);
		

	}

}
