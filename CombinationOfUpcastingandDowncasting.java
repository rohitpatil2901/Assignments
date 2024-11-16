package Encapsulation;

public class CombinationOfUpcastingandDowncasting {

	
	static class Animal{
		
		void pet(){
			System.out.println("Dog is barking");
		}
	}
	
	
	static class Dog extends Animal{
		
		void pet() {
			System.out.println("Dog can be pet");
		}
	}
	
	
	public static void main (String[] args)  {
		// TODO Auto-generated method stub
		Animal animal=new Dog();
		animal.pet();	
		
		if(animal instanceof Dog) {
			Dog dog=(Dog)animal; //downcasting
			dog.pet();
		}else {
			System.out.println("Downcasting not possible");
		}
		
	}

}
