/*  
	Java Programme to convert a Binary Tree to a doubly Linked List

*/
import java.util.*;
class BinaryToDLL {
	static class Node {
		int data;
		Node left, right;
		Node(int x) {
			data = x;
			left = null;
			right = null;
		}
	}
	static Node head;
	static Node prev = null; 
	public static void convertToLinkedList(Node root) {
		if (root == null) return;
		convertToLinkedList(root.left);
		if (prev == null) {
			head = root;
		}else {
			prev.right = root;
			root.left = prev;
		}
		prev = root;
		convertToLinkedList(root.right);
	}
	public static void main(String[] args) {
		// create a binary tree
		// create an instance of tree
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(15);
		root.left.left = new Node(3);
		root.left.right = new Node(2);
		root.right.left = new Node(13);
		root.right.right = new Node(25);
		// convrt that tree to Linked List
		convertToLinkedList(root);
		// traverse the LinkedList
		Node iter = head;
		while (iter != null) {
			System.out.print(iter.data+ " ");
			iter = iter.right;
		}
		System.out.println("Answer !!");
	}
}