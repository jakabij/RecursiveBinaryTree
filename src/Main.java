
public class Main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.addNode(6);//F
		
		tree.addNode(7);//G
		tree.addNode(9);//I
		tree.addNode(8);//H
		
		
		tree.addNode(2);//B
		tree.addNode(1);//A
		tree.addNode(4);//D
		tree.addNode(3);//C
		tree.addNode(5);//E
		
		
		tree.preOrder(tree.getRoot());
	}
}
