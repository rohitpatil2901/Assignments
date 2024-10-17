package Assignments;

public class FourAccessSpecifiers {
	
	public int bus() {
		
		System.out.println("bus");
		return 0;}
	
	
	private void mercedez() {
		System.out.println("mercedez");
	}
	
	String alto(){
		
		System.out.println("alto");
		
		return null;}
	
	void Railway() {
		
		System.out.println("Railway");
	}

	
	protected void LC() {
		
		System.out.println("land cruiser");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FourAccessSpecifiers AS=new FourAccessSpecifiers();
		AS.Railway();
		AS.mercedez();
		AS.LC();
		AS.bus();
	}

}
