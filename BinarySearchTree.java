package advanced_Level;
public class BinarySearchTree {
	  class Node {
	        int key;
	        Node left, right;

	        public Node(int item) {
	            key = item;
	            left = right = null;
	        }
	    }

	    // Root of BST
	    Node root;

	    // Constructor
	    BinarySearchTree() {
	        root = null;
	    }

	    // Method to call insertRec()
	    void insert(int key) {
	        root = insertRec(root, key);
	    }

	    // A recursive function to insert a new key in BST
	    Node insertRec(Node root, int key) {

	        /* If the tree is empty, return a new node */
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }

	        /* Otherwise, recur down the tree */
	        if (key < root.key)
	            root.left = insertRec(root.left, key);
	        else if (key > root.key)
	            root.right = insertRec(root.right, key);

	        /* return the (unchanged) node pointer */
	        return root;
	    }

	    // Method to call searchRec()
	    boolean search(int key) {
	        return searchRec(root, key);
	    }

	    // A recursive function to search a key in BST
	    boolean searchRec(Node root, int key) {
	        // Base Cases: root is null or key is present at root
	        if (root==null || root.key==key)
	            return root != null;

	        // Key is greater than root's key
	        if (root.key < key)
	            return searchRec(root.right, key);

	        // Key is smaller than root's key
	        return searchRec(root.left, key);
	    }

	    public static void main(String[] args) {
	        BinarySearchTree tree = new BinarySearchTree();

	        /* Create the following BST
	              50
	             /  \
	            30  70
	           / \  / \
	         20 40 60 80 */
	        tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);

	        // Print the result of searching for different numbers
	        System.out.println(tree.search(20)); // true
	        System.out.println(tree.search(90)); // false
	    }
}

