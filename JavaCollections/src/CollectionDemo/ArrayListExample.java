package CollectionDemo;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {

		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		System.out.println("One Dimentional Array : " + array[1]);

		int[][] arrayTwo = { { 1, 2 }, { 3, 4 } };
		System.out.println("Two Dimentional Array : " + arrayTwo[1][1]);

	}

}
