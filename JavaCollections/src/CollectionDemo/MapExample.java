package CollectionDemo;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(1, "One");

		System.out.println("Map : " + map);

		for (Iterator<Entry<Integer, String>> item = map.entrySet().iterator(); item.hasNext();) {
			Entry<Integer, String> e = item.next();
			System.out.println("item.key : " + e.getKey() + " --- item.value : " + e.getValue());
		}
	}

}
