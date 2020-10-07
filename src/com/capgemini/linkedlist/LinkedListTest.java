package com.capgemini.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void given3NodesAddingToTopShouldPassTest() {

		Node<Integer> thirdNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> firstNode = new Node<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.addNode(firstNode);
		myLinkedList.addNode(secondNode);
		myLinkedList.addNode(thirdNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.head.equals(thirdNode) &&
				myLinkedList.head.getNext().equals(secondNode)&& 
				myLinkedList.tail.equals(firstNode);
		Assert.assertTrue(result);
	}

}