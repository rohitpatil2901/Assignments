package Assignments;


 class AOne {

	AOne(){
		
		System.out.println("Aone");
	}
	
 }
 
class Atwo extends AOne{
	
	Atwo(int a, int b){
		super();
		System.out.println("Atwo");
		
	}
}

class Athree extends Atwo{
	
	Athree(String s){
		super(10,20);
		System.out.println("Athree");
	}
}


 class AFour extends Athree {

	AFour(){
		super("Rohit");
		System.out.println("Afour");
		
	}
	
	public static void main(String args[]) {
		
		new AFour();
	}
	

 }



