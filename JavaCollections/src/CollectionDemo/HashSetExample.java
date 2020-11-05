package CollectionDemo;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		hashset.add("One");
		hashset.add("One");
		hashset.add("Two");
		hashset.add("Three");
		hashset.add("Four");
		hashset.add("Four");
		hashset.add(null);
		hashset.add(null);
		System.out.println("Hash Set : " + hashset);

	}

}
