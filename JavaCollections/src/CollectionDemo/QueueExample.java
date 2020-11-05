package CollectionDemo;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("Apple");
		queue.add("Banana");
		queue.add("grape");
		System.out.println("Queue : " + queue);
		queue.remove("Banana");
		System.out.println("Queue after remove : " + queue);
		System.out.println("Queue contains Apple : " + queue.contains("Apple"));
		queue.clear();
	}

}
