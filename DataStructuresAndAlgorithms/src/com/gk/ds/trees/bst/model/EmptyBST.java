/**
 * 
 */
package com.gk.ds.trees.bst.model;

/**
 * @author gauravkhandave
 *
 */
public class EmptyBST<D extends Comparable> implements Tree<D> {

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public int cardinality() {
		return 0;
	}

	@Override
	public boolean member(D elem) {
		return false;
	}

	@Override
	public NonEmptyBST<D> add(D elem) {
		return new NonEmptyBST<>(elem);
	}

}
