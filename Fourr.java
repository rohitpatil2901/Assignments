package Assignments;



	class Onee {

		static void testOne() {

			System.out.println("Print One");
		}

	}	


	class Twoo extends Onee {

	static void testTwo () {

		System.out.println("Print Two");
	}
}

	class Three extends Twoo {

	void testThree() {
		System.out.println("Print Three");
	}
}

	public class Fourr extends Three {
		

	void testFour() {

		System.out.println("Print Four");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fourr F=new Fourr();
		F.testOne();
		F.testTwo();
		F.testThree();
		F.testFour();
		
	}

}
