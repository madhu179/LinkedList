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

		boolean result = myLinkedList.head.equals(thirdNode) && myLinkedList.head.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(firstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NodesApeendingShouldPassTest() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.appendNode(firstNode);
		myLinkedList.appendNode(secondNode);
		myLinkedList.appendNode(thirdNode);

		myLinkedList.printNodes();

		boolean result = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void insertingaNodeShouldPassTest() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.appendNode(firstNode);
		myLinkedList.appendNode(thirdNode);

		myLinkedList.insertNode(firstNode, secondNode);

		myLinkedList.printNodes();

		boolean result = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void deletingFirstNodeShouldPassTest() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.appendNode(firstNode);
		myLinkedList.appendNode(secondNode);
		myLinkedList.appendNode(thirdNode);

		INode poppedNode = myLinkedList.pop();

		myLinkedList.printNodes();

		boolean result = poppedNode.equals(firstNode) && myLinkedList.head.equals(secondNode)
				&& myLinkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void deletingLastNodeShouldPassTest() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.appendNode(firstNode);
		myLinkedList.appendNode(secondNode);
		myLinkedList.appendNode(thirdNode);

		INode poppedNode = myLinkedList.popLast();

		myLinkedList.printNodes();

		boolean result = poppedNode.equals(thirdNode) && myLinkedList.head.equals(firstNode)
				&& myLinkedList.tail.equals(secondNode);
		Assert.assertTrue(result);
	}

	@Test
	public void searchingaNodeShouldPassTest() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.appendNode(firstNode);
		myLinkedList.appendNode(secondNode);
		myLinkedList.appendNode(thirdNode);

		myLinkedList.printNodes();

		INode seachedNode = myLinkedList.searchNode(30);

		boolean result = seachedNode.getKey().equals(30);
		Assert.assertTrue(result);
	}

}
