/*
	Binary Search Tree Problems
	Q.1) Given a BST, find it's balanced or not 
	Time Complexity - O (n)
	reduced the time complexity to O(n)
*/
import java.util.*;
class BSTBalanced2 {
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
	static class Height {
		int h;
		Height(int h) {
			this.h = h;
		}
	}
	public static boolean isBalanced(TreeNode root, Height h) {
		// Base Case
		if (root == null) {
			h.h = 0;
			return true;
		}
		// We need to go from bottom up manner
		Height lH = new Height(0);
		Height rH = new Height(0);

		if (isBalanced(root.left, lH) && isBalanced(root.right, rH)) 
		{	h.h = Math.abs(lH.h - rH.h)+1;
			if (h.h > 1)
				return false;
		}
		else
			return false;
		return true;	// here the root is balanced, check recursively for left and right subtree
	}
	public static void main(String[] args) {
		// Create the Tree
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(2);
		// check for AVL tree - height balanced binary search tree
		Height h = new Height(0);
		if (isBalanced(root, h)) 
			System.out.println("Yes the tree is AVL- height balanced binary search tree " + h.h);
		else 
			System.out.println("No, the tree is not height balanced binary search tree");
	}
}