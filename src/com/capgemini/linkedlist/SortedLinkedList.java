package com.capgemini.linkedlist;

public class SortedLinkedList {

	public INode Head;
	public INode Tail;

	public SortedLinkedList() {
		this.Head = null;
		this.Tail = null;
	}

	public void addNodeInOrder(INode newNode) {
		if (Tail == null && Head == null) {
			this.Tail = newNode;
			this.Head = newNode;
		}

		else if (((Comparable) Head.getKey()).compareTo(newNode.getKey()) > 0) {
			newNode.setNext(Head);
			this.Head = newNode;
			INode tempNode = this.Head;
			while (tempNode.getNext() != null)
				tempNode = tempNode.getNext();
			this.Tail = tempNode;
		}

		else {
			INode tempNode = this.Head;
			INode beforeNode = tempNode;
			tempNode = tempNode.getNext();
			while (tempNode != null && ((Comparable) tempNode.getKey()).compareTo(newNode.getKey()) < 0) {
				beforeNode = tempNode;
				tempNode = tempNode.getNext();
			}
			if (beforeNode.equals(Tail))
				this.Tail = newNode;
			beforeNode.setNext(newNode);
			newNode.setNext(tempNode);
		}
	}

	public void printAllNodes() {
		INode tempNode = this.Head;
		String nodes = " ";
		while (tempNode.getNext() != null) {
			nodes = nodes + tempNode.getKey();
			if (!tempNode.equals(Tail))
				nodes = nodes + "->";
			tempNode = tempNode.getNext();
		}
		nodes = nodes + tempNode.getKey();
		System.out.println("Linked List : " + nodes);

	}

}
