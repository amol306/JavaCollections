package CollectionDemo;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "One");
		hashmap.put(2, "Two");
		hashmap.put(3, "Three");
		hashmap.put(4, "Four");
		hashmap.put(null, "Four");
		hashmap.put(null, "Five");
		System.out.println("Hash map : " + hashmap);
	}

}
