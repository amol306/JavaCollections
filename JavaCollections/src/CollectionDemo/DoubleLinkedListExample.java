package CollectionDemo;

import CollectionDemo.LinkedListExample.Node;

public class DoubleLinkedListExample {

	Node head;

	static class Node {
		int data;
		Node next;
		Node previous;

		Node(int d) {
			data = d;
			next = null;
			previous = null;
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
		DoubleLinkedListExample list = new DoubleLinkedListExample();
		list.head = new Node(1);
		Node Second = new Node(2);
		Node Third = new Node(3);

		list.head.next = Second;
		list.head.previous = null;
		Second.next = Third;
		Second.previous = list.head;
		Third.next = null;
		Third.previous = Second;
		
		list.display();
	}

}
