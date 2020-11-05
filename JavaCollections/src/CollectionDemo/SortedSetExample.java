package CollectionDemo;

import java.util.*;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		System.out.println("Sorted Set : " + set);

		Iterator j = set.iterator();
		while (j.hasNext()) {
			Object o = j.next();
			System.out.println("Set element : " + o.toString());
		}
	}

}
