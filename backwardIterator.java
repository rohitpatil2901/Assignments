package assignment2;

import java.util.ArrayList;
import java.util.ListIterator;

public class backwardIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list=new ArrayList<>();
		list.add("Mango");
		list.add("Coconut");
		list.add("Apple");
		list.add("Banana");
		list.add("Kiwi");
		
		ListIterator<String> iterator=list.listIterator();
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

}

//output:getting blank console
