/**
 * 
 */
package com.gk.ds.trees.bst.model;

/**
 * @author gauravkhandave
 *
 */
public class SubTree {
	private SubTree left;
	private SubTree right;
	private int data;

	public SubTree(int data) {
		this.data = data;
		left = right = null;
	}
	
	public SubTree getLeft() {
		return left;
	}

	public void setLeft(SubTree left) {
		this.left = left;
	}

	public SubTree getRight() {
		return right;
	}

	public void setRight(SubTree right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	
}
