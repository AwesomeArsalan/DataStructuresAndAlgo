package datastructures.tree;

public class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
	
	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	
}
