package Assignments;

interface s{

	void sOne();
	void sTwo();
	
}

abstract class sThree implements s{

	
	abstract void ssb();

	
	abstract void ssc();
	
	void thirdfunc() {
		System.out.println("thirdFunc");
	}
	
	void fourthfunc() {
		System.out.println("fourthfunc");
	}
}

class Syria extends sThree{

	@Override
	public void sOne() {
		// TODO Auto-generated method stub
		System.out.println("sOne");
	}

	@Override
	public void sTwo() {
		// TODO Auto-generated method stub
		System.out.println("sTwo");
	}

	@Override
	void ssb() {
		// TODO Auto-generated method stub
		System.out.println("sThree");
	}

	@Override
	void ssc() {
		// TODO Auto-generated method stub
		System.out.println("sFour");
	}}

public class AMACInterface extends Syria{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AMACInterface ama=new AMACInterface();
		ama.thirdfunc();
		ama.fourthfunc();
		ama.sOne();
		ama.sTwo();
		ama.ssb();
		ama.ssc();
		
		
	}

}
