package datastructures.tree;

public class Main {
	public static void main(String args[]) 
    { 
		Tree tree = new Tree();
        System.out.println("Binary Tree Example");
        System.out.println("Building datastructures.tree with root value 5");
        tree.insert(5);
        tree.insert(2);
        tree.insert(4);
        tree.insert(8);
        tree.insert(6);
        tree.insert(7);
        tree.insert(3);
        tree.insert(9);
        System.out.println("Traversing datastructures.tree in order");
        tree.traverseInOrder();
        System.out.println();
        tree.traversePreOrder();
        System.out.println();
        tree.traversePostOrder();
   }
}
