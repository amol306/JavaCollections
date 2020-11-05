package CollectionDemo;

import java.util.*;

public class LinkedListExample {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void display() {
		Node n = head;
		while (n != null) {
			System.out.println("Node value : " + n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedListExample list = new LinkedListExample();
		list.head = new Node(1);
		Node Second = new Node(2);
		Node Third = new Node(3);

		list.head.next = Second;
		Second.next = Third;
		Third.next = null;
		
		list.display();
	}

}
