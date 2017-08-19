package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class Day22BinarySearchTree {

	public static int getHeight(Node2 root) {
		if (root == null) {
			return -1;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);

		return Math.max(leftHeight, rightHeight) + 1;
	}

	public static Node2 insert(Node2 root, int data) {
		if (root == null) {
			return new Node2(data);
		} else {
			Node2 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node2 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
		sc.close();
	}

}

class Node2 {
	Node2 left, right;
	int data;

	Node2(int data) {
		this.data = data;
		left = right = null;
	}
}