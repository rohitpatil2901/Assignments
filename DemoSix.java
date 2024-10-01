package Assignments;


class Esixx{
	
	void EsixOne() {
		System.out.println("EsixOne");
	}
	
	void EsixTwo() {
		System.out.println("EsixTwo");
		
	}
	 void EsixThree() {
		System.out.println("EsixThree");
		
	}
	void EsixFour() {
		System.out.println("EsixFour");
		
	}
	
	
}

class EsixSevenn extends Esixx {
	
void EsixOne() {
	super.EsixThree();
	super.EsixFour();
	System.out.println("EsixFive");
	
	}

void EsixTwo() {
	
	System.out.println("EsixSix");
	
}
 void EsixThree() {
	System.out.println("EsixSeven");
	
}
void EsixFour() {
	System.out.println("EsixEight");
	
	
}
	
}

public class DemoSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EsixSevenn Es=new EsixSevenn();
		Es.EsixOne();
		
	}

}

