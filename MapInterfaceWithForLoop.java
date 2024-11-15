package assignments3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterfaceWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> obj=new HashMap<String,Integer>();
		obj.put("one", 1);
		obj.put("two", 2);
		obj.put("three", 3);
		obj.put("four", 4);
		
		Iterator<Entry<String, Integer>> iterator=obj.entrySet().iterator();
		
		for(Entry<String, Integer> obj2: obj.entrySet()) {
			System.out.println(obj2);
		}
	}

}
