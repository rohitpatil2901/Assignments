package Assignments;


 class AOne {

	AOne(){
		
		System.out.println("Aone");
	}
	
 }
 
class Atwo extends AOne{
	
	Atwo(){
		System.out.println("Atwo");
		
	}
}

class Athree extends Atwo{
	
	Athree(){
		System.out.println("Athree");
	}
}


 class AFour extends Athree {

	AFour(){
		
		System.out.println("Afour");
		
	}
	
	public static void main(String args[]) {
		
		new AFour();
	}
	

 }



