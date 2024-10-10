package Assignments;


interface one{
	
	
	void ricohOne();
}
interface two extends one{

	void  ricohTwo();}

class SS implements one, two{

	public void ricohTwo() {
		// TODO Auto-generated method stub
		System.out.println("ricohTwo is startUp");
	}

	
	 public void ricohOne() {
		// TODO Auto-generated method stub
		System.out.println("ricohTwo and ricohOne both are startUps");
	}
	
}
public class MultiLevel extends SS{

	public static void main(String[] args) {
		
	SS ss=new SS();
	ss.ricohOne();
	ss.ricohTwo();
	
		

	}

}
