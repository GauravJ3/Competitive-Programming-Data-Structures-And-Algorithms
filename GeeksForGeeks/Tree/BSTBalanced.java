/*
	Binary Search Tree Problems
	Q.1) Given a BST, find it's balanced or not 
	Time Complexity - O (n^2)
	reduce the time complexity to O(n)
*/
import java.util.*;
class BSTBalanced {
	/*
		TreeNode -
		val, left, right
	*/
	static class TreeNode {
		int val;
		TreeNode left, right;
		TreeNode(int x) {
			val = x;
			left = null;
			right = null;
		}
	}
	public static int height(TreeNode root) {
		// Base Case
		if (root == null) 
			return 0;
		return Math.max(height(root.left), height(root.right)) + 1;	// Height of tree
	}
	public static boolean isBalanced(TreeNode root) {
		// Base Case
		if (root == null) return true;
		// calculate left height
		int lH = height(root.left);
		int rH = height(root.right);
		int diff = Math.abs(lH - rH);
		if (diff > 1)
			return false;
		return (isBalanced(root.left) && isBalanced(root.right));	// here the root is balanced, check recursively for left and right subtree
	}
	public static void main(String[] args) {
		// Create the Tree
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(2);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(23);
		// check for AVL tree - height balanced binary search tree
		if (isBalanced(root)) System.out.println("Yes the tree is AVL- height balanced binary search tree");
		else 
			System.out.println("No, the tree is not height balanced binary search tree");
	}
}