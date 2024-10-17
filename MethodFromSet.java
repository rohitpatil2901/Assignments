package assignment2;

import java.util.HashSet;
import java.util.Set;

public class MethodFromSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new HashSet<>();
		set.add("First");
		set.add("Strig");
		set.add("west");
		set.add("east");
		set.add("substance");
		
		for(String s:set) {
			
			System.out.println(s);
		}
		
	}

}
