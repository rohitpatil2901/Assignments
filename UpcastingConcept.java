package assignment2;

import java.util.ArrayList;
import java.util.Collection;

public class UpcastingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collection <String> collection=new ArrayList<>();// upcasting to collection interface from subclass ArrayList
		collection.add("one");
		collection.add("Two");
		collection.add("three");
		collection.add("four");
		collection.add("five");
		
		for(String s:collection) {
		System.out.println(s);
		}
	}

}
