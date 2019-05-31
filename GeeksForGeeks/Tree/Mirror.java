/*
	Question => Given a Binary Tree, convert it into its mirror
*/

import java.util.*;
class Mirror {
	class Node {
		int data;
		Node left, right;
		Node(int x) {
			data = x;
			left = null;
			right = null;
		}
	}
	public static void mirror(Node root) {
		// if no root
		// idea is simple call left subtree, and then call rght subtree
		// swap them 
		if (root == null) return;
		mirror(root.left);
		mirror(root.right);
		Node tmp = root.left;
		root.left = root.right;
		root.right = tmp;

	}
	public static void printTree(Node root) {
		// base case
		if (root == null) return;
		// print the root
		System.out.print(root.data+" ");
		// go to left
		// go to right
		printTree(root.left);
		printTree(root.right);
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Node root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(2);
		root.right.left = new Node(5);
		root.right.right = new Node(4);

		/*               mirror
					 1     |     1
					/ \    |    / \
				   3   2   |   2   3
				   	  / \  |  / \
				     5   4 | 4   5

		*/
		mirror(root);
		printTree(root);
	}
}
