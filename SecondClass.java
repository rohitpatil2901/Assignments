package fourAccessSpecifiersj;

import acthree.EpicOne;

public class SecondClass extends EpicOne {

	public static void main(String[] args) {
		
		
		// we can't access private and default members from another package by becoming subclass
		
		SecondClass sc=new SecondClass();
		sc.lecture();//protected
		
		System.out.println(sc.e2); //this variable is declared as protected in another package  under EpicOne class 
		System.out.println(sc.e0);// public 
		
		
		
	}

}
