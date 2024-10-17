package assignment2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sortingoflist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<>();
		
		list.add("Mobile");
		list.add("TV");
		list.add("Furniture");
		list.add("Cloths");
		list.add("Avenue");
		list.add("Bist");
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}

}

//output: [Avenue, Bist, Cloths, Furniture, Mobile, TV]
//the added list sorted by using Collections class
