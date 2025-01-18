package datastructures.tree;

public class Tree {
	Node root;
	
	void insert(int data) 
	{
		Node newNode = new Node(data);
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			insertNode(root, data);
		}
	}
	
	void insertNode(Node node, int value) 
	{
		System.out.println("root " + root);
		if (value < node.data) 
		{
			if (node.left != null) {
				insertNode(node.left, value);
			} else {
				System.out.println(" Inserted " + value + " to left of " + node.data);
				node.left = new Node(value);
			}
		} 
		else if (value > node.data) {
			if (node.right != null) {
				insertNode(node.right, value);
			} else {
				System.out.println("  Inserted " + value + " to right of " + node.data);
				node.right = new Node(value);
			}
		}
    }

	//In order traversal
	void traverseInOrder()
	{
		Node next = this.root;
		if (next != null)
		{
			traverseIn(next);
		}
		else
		{
			System.out.println("Tree is empty");
		}
	}
	
	void traverseIn(Node root)
	{
		if (root != null)
		{
			traverseIn(root.left);
            System.out.print(" " + root.data);
            traverseIn(root.right);
		}
	}
	
	//Pre order traversal
	void traversePreOrder()
	{
		Node next = this.root;
		if (next != null)
		{
			traversePre(next);
		}
		else
		{
			System.out.println("Tree is empty");
		}
	}
	
	void traversePre(Node root)
	{
		if (root != null)
		{
			System.out.print(" " + root.data);
			traversePre(root.left);
            traversePre(root.right);
		}
	}
	
	//Pre order traversal
	void traversePostOrder()
	{
		Node next = this.root;
		if (next != null)
		{
			traversePost(next);
		}
		else
		{
			System.out.println("Tree is empty");
		}
	}
	
	void traversePost(Node root)
	{
		if (root != null)
		{
			traversePost(root.left);
            traversePost(root.right);
            System.out.print(" " + root.data);
		}
	}
}
