package Assignments;

class Eone{
	
Eone(){
	this(10);
System.out.println("Eone");	
}	

Eone(int a){
	this(10,"Rohit");
	System.out.println("Eone two");	
}

Eone(int a,int b){
	this();
	System.out.println("Eone three");
}

Eone(int a,String c){
	
	System.out.println("Eone four");
	
}
	
	
}


public class DemoFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	new Eone();
	
		
	}

}
