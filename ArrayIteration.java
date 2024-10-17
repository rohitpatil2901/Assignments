package assignment2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> cars=new ArrayList<>();
		cars.add("LC200");
		cars.add("Fortuner");
		cars.add("Nissan Patrol");
		cars.add("LC300");
		cars.add("Hammer");
		
		Iterator<String> iterator=cars.iterator();
		while(iterator.hasNext()) {
			String car=iterator.next();
			System.out.println(car);
		}
	}

}
