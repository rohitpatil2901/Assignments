package assignments3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FineElementFromMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> obj=new HashMap<Integer,String>();
		
		obj.put(4938, "Ramesh Student");
		obj.put(4399, "Suresh Student");
		obj.put(9833, "Naresh Student");
		
		Iterator<Entry<Integer,String>> iterator=obj.entrySet().iterator();
		
		int rollNumber=4938;
		String nameToCheck="Ramesh Student";
		
		if(obj.containsKey(rollNumber)) {
			
		String	name=obj.get(rollNumber);
		
		if(name.equals(nameToCheck)) {
			System.out.println(rollNumber+" and " + nameToCheck+ " both are present");
		}
		else {
			System.out.println(rollNumber+" and " + nameToCheck+ " both are not present");
		}
		
		
		}
		else {
			System.out.println(rollNumber+" and " + nameToCheck+ " both are not present");
		}

	}

}
