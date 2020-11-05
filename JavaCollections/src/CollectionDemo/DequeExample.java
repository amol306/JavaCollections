package CollectionDemo;

import java.util.*;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.offer(20);
		deque.offerLast(30);
		deque.offerFirst(10);
		System.out.println("Deque : " + deque);

		System.out.println("First element of Deque : " + deque.peekFirst());
		System.out.println("Last element of Deque : " + deque.peekLast());

		System.out.println("Deque after first element removed [" + deque.pollFirst() + "]: " + deque);

	}

}
