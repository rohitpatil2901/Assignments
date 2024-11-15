package assignments3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterfaceAssignment69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String,Integer> obj=new HashMap<String, Integer>();
		obj.put("Age", 12);
		obj.put(" number", 349);
		obj.put("Age2", 43);
		obj.put("Age3", 23);
		
		Iterator <Entry<String,Integer>> iterator=obj.entrySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
	}

}
