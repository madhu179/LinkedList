package com.capgemini.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {

	@Test
	public void given3NodesAddingShouldPassTest() {

		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(result);
	}
}