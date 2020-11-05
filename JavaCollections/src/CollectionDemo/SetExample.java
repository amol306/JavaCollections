package CollectionDemo;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		int count[] = { 21, 23, 43, 53, 22, 65 };
		Set<Integer> set = new HashSet<>();
		try {
			for (int j = 0; j < count.length; j++) {
				set.add(count[j]);
			}
			System.out.println("Set : " + set);

			TreeSet<Integer> sortedSet = new TreeSet<>(set);
			System.out.println("Sorted Set : " + sortedSet);

			System.out.println("First element of Sorted Set : " + (Integer) sortedSet.first());
			System.out.println("Last element of Sorted Set : " + (Integer) sortedSet.last());
		} catch (Exception ex) {

		}
	}

}
