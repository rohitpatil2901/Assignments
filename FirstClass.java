package fourAccessSpecifiersj;


class second{
	
	public String state="Goa";
	private String twostate="Chatisgadh";
	protected String Country="North Corea";
	 String defaultCountry="China";
	
	
}
public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		second s=new second();
		System.out.println(s.state);// can access public in same package
		System.out.println(s.Country);// can access protected in same package
		System.out.println(s.defaultCountry);// can access default in same package
		System.out.println(s.twostate);// we can't access private method from another class in same package
		
		
	}
	
	

}
