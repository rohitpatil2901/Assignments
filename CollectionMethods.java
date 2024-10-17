package assignment2;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collection <String> list=new ArrayList<>();
		list.add("Rohit");
		list.add("Class");
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		
		for(String s:list) {
			
			System.out.println(s);
		}
		
		System.out.println("Does collection contains Rohit: "+list.contains("Rohit"));
		
		System.out.println(list.size());
	
		list.clear();
		
		
	}

}
