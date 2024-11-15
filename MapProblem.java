package assignments3;

import java.util.HashMap;
import java.util.Map;

public class MapProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> obj=new HashMap<String,Integer>();
		obj.put("Apple", 4);
		obj.put("Orange", 3);
		obj.put("banana", 5);
		obj.put("Kiwi", 43);
		//remove
		obj.remove("Apple", 4);
		//print fruits and their quantity
		System.out.println("Apple Fruit quantity: "+obj.entrySet());
		
	}

	
}
