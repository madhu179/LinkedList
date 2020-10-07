package com.capgemini.linkedlist;

public class Node<K> implements INode<K>{

	private K key;
	private INode next;

	Node(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setNext(INode next) {
		this.next = next;
	}

	public INode getNext() {
		return (next);
	}

}
