package assignment2;

import java.util.ArrayList;
import java.util.ListIterator;


public class Literator {

	 public static void main(String[] args) {
	       
	        ArrayList<String> bike = new ArrayList<>();
	        bike.add("Splendour");
	        bike.add("Pulsur");
	        bike.add("Apache");
	        bike.add("Bullet");
	        bike.add("Ola");
	        
	        
	        ListIterator<String> listIterator = bike.listIterator();
	        
	        
	        System.out.println("Iterating forward through the ArrayList:");
	        while (listIterator.hasNext()) {
	            String bikeName = listIterator.next();
	            System.out.println(bikeName);
	        }

	        
	    }

}
