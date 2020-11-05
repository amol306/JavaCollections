package CollectionDemo;

import java.util.*;

public class SortedMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> sortedMap = new TreeMap<>();
		sortedMap.put(1, "One");
		sortedMap.put(4, "Four");
		sortedMap.put(2, "Two");
		sortedMap.put(3, "Three");
		System.out.println("Sorted Map : " + sortedMap);
	}

}
