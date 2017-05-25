package com.gk.ds.trees.bst;

import com.gk.ds.trees.bst.model.NonEmptyBST;
import com.gk.ds.trees.bst.model.Tree;

public class BinarySearchTree {
	private static Tree<Integer> bst = new NonEmptyBST<>();
	public static void main(String[] args) {
		bst.add(new Integer(5));
		bst.add(new Integer(3));
		bst.add(new Integer(8));
		bst.add(new Integer(9));
		bst.add(new Integer(12));
		bst.add(new Integer(2));
		bst.add(new Integer(1));
		
		System.out.println(bst.isEmpty());
	}

}
