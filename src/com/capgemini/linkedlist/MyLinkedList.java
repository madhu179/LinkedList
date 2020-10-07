package com.capgemini.linkedlist;

public class MyLinkedList {

	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addNode(INode newNode) {
		if (tail == null)
			this.tail = newNode;

		if (head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head;
			newNode.setNext(tempNode);
			this.head = newNode;
		}
	}

	public void appendNode(INode newNode) {

		if (head == null)
			this.head = newNode;
		if (tail == null)
			this.tail = newNode;
		else {
			INode tempNode = this.tail;
			tempNode.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void insertNode(INode previousNode, INode newNode) {
		INode tempNode = previousNode.getNext();
		newNode.setNext(tempNode);
		previousNode.setNext(newNode);
	}

	public INode pop() {
		INode tempfirstNode = this.head;
		INode tempNode = this.head.getNext();
		this.head.setNext(null);
		this.head = tempNode;
		return tempfirstNode;
	}

	public void printNodes() {
		INode tempNode = this.head;
		String nodes = " ";
		while (tempNode.getNext() != null) {
			nodes = nodes + tempNode.getKey();
			if (!tempNode.equals(tail))
				nodes = nodes + "->";
			tempNode = tempNode.getNext();
		}
		nodes = nodes + tempNode.getKey();
		System.out.println("Linked List : " + nodes);

	}

}
