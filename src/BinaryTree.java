public class BinaryTree {
	 private Node root;
	 
	 public Node getRoot() {
		 return this.root;
	 }
	 
	 public void addNode(int value) {
		 Node newNode = new Node(value);
		 
		 //if it has no root than add that
		 if (root == null) {
			 root = newNode;
	        
	    }else {
	    	
	    	Node parentOfAddedNode = recursiveAdding(root, newNode);
//	    	System.out.println("Added node's parent: " + parentOfAddedNode.value);
	    }
	 } 
	 
	 private Node recursiveAdding(Node focusNode,Node newNode) {
		Node parent = focusNode;
		
		if(newNode.value > focusNode.value) {
			//goes to the right 
			focusNode = focusNode.right;
			
			if(focusNode == null) {
				parent.right = newNode;
			}else {
				return recursiveAdding(focusNode, newNode);
			}
		}else {
			//goes to the left 
			focusNode = focusNode.left;
			
			if(focusNode == null) {
				parent.left = newNode;
			}else {
				return recursiveAdding(focusNode, newNode);
			}
		}
		return parent;
	 }
	 
	 
	 public void preOrder(Node node) {
		    if (node != null) {
		    	System.out.print(node.value + " ");
			    preOrder(node.left);
			    preOrder(node.right);
		    }
		  }
}
