package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapProgram1 {

	public static void main(String[] args) {

//		Map<Integer, String> map=new HashMap<Integer, String>();
//		Map<Integer, String> map=new HashMap<>();
		var map = new LinkedHashMap<Integer, String>(); // unique key, values can be duplicate,  ordered 
				//TreeMap<Integer,String>();// unique  and sorted key, values can be duplicate, not ordered
				//HashMap<Integer, String>(); // unique key, values can be duplicate, not ordered

		map.put(10001, "suresh kumar"); // put for adding key, value
		map.put(10003, "shyam kumar");
		map.put(10001, "mahesh kumar"); // it will replace first record
		map.put(10002, "ram kumar");
		map.put(10004, "suresh kumar");

		System.out.println(map);
//		Set<Integer> keySet = map.keySet();
		var keySet = map.keySet();
		
		Collection<String> values = map.values();
		System.out.println("keys " +keySet);
		System.out.println("values " +values);

		map.remove(10002);
		
		for (Integer integer : keySet) {
			System.out.println(integer+"    ----    "+map.get(integer)); 
			                 // get -- get value with key 
		}
		
		System.out.println(map.containsKey(10002));
		System.out.println(map.containsKey(10001));
		System.out.println(map.containsValue("ram kumar"));
		
		Set<Entry<Integer, String>> entrySet = map.entrySet(); 
		// Entry  -- interface  represents one entry 
		
		for(Entry<Integer, String> entry:entrySet) {
			System.out.println(entry.getKey()+"  .....   "+entry.getValue());
		}
		
	}
}
