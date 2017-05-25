/**
 * 
 */
package com.gk.ds.trees.bst.model;

/**
 * @author gauravkhandave
 *
 */
public class NonEmptyBST<D extends Comparable> implements Tree<D> {

	D root;
	Tree<D> left;
	Tree<D> right;

	public NonEmptyBST() {
		root = null;
		left = new EmptyBST<>();
		right = new EmptyBST<>();
	}

	public NonEmptyBST(D elem) {
		root = elem;
		left = new EmptyBST<>();
		right = new EmptyBST<>();
	}

	public NonEmptyBST(D root, Tree<D> left, Tree<D> right) {
		this.root = root;
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean isEmpty() {
		if(root==null){
			return true;
		}else{
		return false;
		}
	}

	@Override
	public int cardinality() {
		return 1 + left.cardinality() + right.cardinality();
	}

	@Override
	public boolean member(D elem) {
		if (root==elem) {
			return true;
		} else {
			if (elem.compareTo(root) < 0) {
				return left.member(elem);
			} else {
				return right.member(elem);
			}
		}
	}

	@Override
	public NonEmptyBST<D> add(D elem) {
		if (root==null) {
			return new NonEmptyBST<>(elem);
		} else {
			if (elem.compareTo(root) < 0) {
				return new NonEmptyBST(root, left.add(elem), right);
			} else {
				return new NonEmptyBST(root, left, right.add(elem));
			}
		}
	}

}
