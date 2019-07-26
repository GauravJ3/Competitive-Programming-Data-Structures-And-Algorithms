import java.io.*;
class SecondLargestElementBST {
	static class Node {
	    int data;
	    Node left, right;
	    Node(int x) {
	        data = x;
	        left = null;
	        right = null;
	    }
	}
	public static Node secondLargest(Node root, Node parent) {
	    // Base Case 
	    //Node parent = null;
	    if (root == null) return root;
	    if (root.right != null) return secondLargest(root.right, root);
	   /* while (root.right != null) {
	        parent = root;
	        root = root.right;
	    }
	    */
	    // check if root.left != null
	    if (root.left != null) 
	        return secondLargest(root.left, root);
	    return root;
	    
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			// Make Tree
			/*        50 
                   /     \ 
                  30      70 
                 /  \       \ 
               20   40      80
                            
			               
			*/          
			Node root = new Node(50);
			root.left = new Node(30);
			root.right = new Node(70);
			root.left.left = new Node(20);
			root.left.right = new Node(40);
			//root.right.left = new Node(60);
			root.right.right = new Node(80);
			
			Node tmp = secondLargest(root, null);
			System.out.println("Second largest element is " + tmp.data);
	}
}