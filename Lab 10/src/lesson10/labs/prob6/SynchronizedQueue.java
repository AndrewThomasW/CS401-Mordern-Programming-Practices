package lesson10.labs.prob6;

public class SynchronizedQueue {
	class Node {
		Object value;
		Node next;
	}
	private Node head;
	private Node tail;
	public synchronized void add(Object newValue) {
		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;
	}
	public synchronized Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		return n.value;
	}
}
