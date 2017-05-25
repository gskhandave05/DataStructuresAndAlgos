/**
 * 
 */
package com.gk.ds.lists.linkedlist;

import java.util.Scanner;

/**
 * @author gauravkhandave
 *
 */
public class LinkedListRemoveDups {

	public static Node removeDuplicates(Node head) {
		// Write your code here
		Node current = head;
		if (head == null || head.getNext() == null) {
			return head;
		}

		while (current.getNext() != null) {

			if (current.getData() == current.getNext().getData()) {
				current.setNext(current.getNext().getNext());
			} else {
				current = current.getNext();
			}

		}
		return head;
	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.getNext() == null)
			head.setNext(p);
		else {
			Node start = head;
			while (start.getNext() != null)
				start = start.getNext();
			start.setNext(p);

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.getData() + " ");
			start = start.getNext();
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}

}
