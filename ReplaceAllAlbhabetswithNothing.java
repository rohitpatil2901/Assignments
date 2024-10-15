package Assignments;

public class ReplaceAllAlbhabetswithNothing {

	public static void main(String[] args) {
		String str="kv no 2",nStr="";
		nStr=nStr+str.replaceAll("[a-z]", "");
		System.out.println(nStr);

	}

}
