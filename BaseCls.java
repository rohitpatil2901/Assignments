package Assignments;


class GSOne{
	
	static void concreteOne() {
		System.out.println("concreteOne");
	}
	static void concreteTwo() {
		System.out.println("concreteTwo");
	}
}

abstract class GSTwo extends GSOne{
	
	abstract void Toyota();
	abstract void Nissan();
	void LC() {
		System.out.println("My car is LC200");
	}
	void Fortuner() {
		System.out.println("My previous car is Fortuner");
	}
}

class bikes extends GSTwo{

	@Override
	void Toyota() {
		// TODO Auto-generated method stub
		System.out.println("Car Company name: Toyota");
	}

	@Override
	void Nissan() {
		System.out.println("Car Company name: Niassan");
		
	}
	
	void FirstCarService() {
		System.out.println("First car service");
	}
	static void SecondCarService() {
		System.out.println("Second car service");
	}
	
	
	
}
public class BaseCls extends bikes{

	

	public static void main(String[] args) {
		

		bikes bs=new bikes();
		BaseCls.concreteOne();
		BaseCls.concreteTwo();
		bs.Toyota();
		bs.Nissan();
		bs.Fortuner();
		bs.LC();
		bikes.SecondCarService();
		bs.FirstCarService();
		
		
	}

}
