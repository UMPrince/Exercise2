package edu.olemiss.csci211;

/** A binary search tree class.
 * 
 * @author rhodes
 *
 * @param <T> the type of element. This type must be comparable to itself.
 */
public class BinarySearchTree<T extends Comparable<T>> {

	/** The tree node itself. Remember, any node could be the
	 * root of a large tree, not just a leaf.
	 */
	 protected class TreeNode{
	
		T e;	
		TreeNode left;
		TreeNode right;
		
		/** Indicate whether this node is a leaf node.
		 * 
		 * @return true if this node is a leaf node, false otherwise.
		 */
		public boolean isLeaf() {
			
			return (left == null) && (right == null);
		}
	}
	 
	// Every tree has a root. If it's null, we have an empty tree.
	protected TreeNode root = null;
	
	
	// These methods are the interface of the BST class itself.
	// They probably need private static helper methods that work
	// on the TreeNodes themselves.  
	
	/** Add the given element to the tree.
	 * 
	 * @param element
	 */
	public void add(T element){

		
		// Write me.  Call a helper! (method)
	}
	

	/** Indicate whether the tree is empty.
	 * 
	 * @return true if the tree is empty, false otherwise.
	 */
	public boolean isEmpty(){
		
		return root==null;
	}
	
	
		
	/**
	 * Indicate whether the tree contains at least one occurrence of the target value.
	 * @param target
	 * @return true if the target is found, false otherwise.
	 */
	public boolean contains(Comparable<T> target){
		
		// Write me.  Call a helper! (method)
		
		return false;
	}

	/**
	 * Returns a string produced by an inOrder traversal of the tree. 
	 * Could be useful for testing and debugging.
	 * @return a string representing the contents of the tree.
	 */
	public String toString(){
		
		return inOrder(root).trim().replaceAll("  +", " "); // remove redundant spaces
	}
	
	/**
	 * An inOrder traversal of the tree.
	 * @param t
	 * @return A String representing the contents of the tree.
	 */
	private String inOrder(TreeNode t){
		
		if (t == null)
			return "";
		
		if (t.isLeaf())
			return "" + t.e; // The "" is there to make Java call toString() for t.e 
		
		String resultLeft =  inOrder(t.left);
		
		String resultRight = inOrder(t.right);
		
		return resultLeft + " " + t.e + " " + resultRight;
	}

	

	
	/* These are where the helper methods go. They are not
	 * available outside the class.
	 */

	/** Helper method for contains().
	 * 
	 * @param t
	 * @param target
	 * @return
	 */
	private boolean contains(TreeNode t, Comparable<T> target){

		// Write me.
		
		return false;
	}

	
	
	
	/** helper method for add.
	 * 
	 * @param aTree
	 * @param newNode
	 */
	private void add(TreeNode aTree, TreeNode newNode){
		

		// Write me.

	}
	
}
