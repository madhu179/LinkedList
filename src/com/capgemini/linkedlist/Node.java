package com.capgemini.linkedlist;

public class Node<K> {

	private K key;
	private Node next;

	Node(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey() {
		this.key = key;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return (next);
	}

}
