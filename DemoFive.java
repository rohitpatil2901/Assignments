package Assignments;


class Esix{
	
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

class EsixSeven extends Esix {
	
void EsixOne() {

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

public class DemoFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EsixSeven Es=new EsixSeven();
		Es.EsixOne();
		
	}

}
