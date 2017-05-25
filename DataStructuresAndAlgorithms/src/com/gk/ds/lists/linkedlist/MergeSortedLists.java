/**
 * 
 */
package com.gk.ds.lists.linkedlist;

import java.util.Scanner;

/**
 * @author gauravkhandave
 *
 */
public class MergeSortedLists {
	
	public static Node MergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 
	    Node merged = new Node();
	    Node mergedHead = merged;
	    while(headA!=null || headB!=null){
	        
	        if(headA !=null && headB != null){
	            
	            if(headA.getData() <= headB.getData()){
	                merged = headA;
	                headA = headA.getNext();
	            } else {
	                merged = headB;
	                headB = headB.getNext();
	            }
	        } else if(headA == null){
	            merged = headB;
	            headA = headB.getNext();
	        } else if(headB == null){
	            merged = headA;
	            headB = headA.getNext();
	        }
	        
	        merged = merged.getNext();
	        
	    }
	    return mergedHead;
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
		Node headA = null;
		Node headB = null;
		Node head = null;
		for(int i=0;i<2;i++){
		int t = sc.nextInt();
		while (t-- > 0) {
			int ele = sc.nextInt();
			headA = insert(headA, ele);
		}
		int t2 = sc.nextInt();
		while (t2-- > 0) {
			int ele = sc.nextInt();
			headB = insert(headB, ele);
		}
		}
		head = MergeLists(headA, headB);
		display(head);

	}

}
