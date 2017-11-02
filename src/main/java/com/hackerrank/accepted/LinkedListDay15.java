package com.hackerrank.accepted;

public class LinkedListDay15 {

	public static Node insert(Node head, int data) {
		if (head == null) {
			Node n = new Node(data);
			return n;
		} else {
			Node nextNode = head.next;
			Node currentNode = head;
			if (nextNode == null) {
				head.next = new Node(data);
			} else {
				currentNode = nextNode;
				nextNode = nextNode.next;
				while (nextNode != null) {
					currentNode = nextNode;
					nextNode = nextNode.next;
				}
				currentNode.next = new Node(data);
			}
			return head;
		}
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Node head = null;
		head = insert(head, 2);
		head = insert(head, 3);
		head = insert(head, 4);
		head = insert(head, 1);
		display(head);
	}

}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}
