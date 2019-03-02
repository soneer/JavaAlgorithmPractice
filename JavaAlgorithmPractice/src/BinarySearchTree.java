 class Node{

		 Node left;
		 Node right;
		 int data;
		 public Node(int val){
			 this.data = val;
		 }	
		 
		 public  void insert(int data, Node root){
				if(data < root.data )
				{
					if(root.left == null){
						root.left = new Node(data);
					}
					else{
						insert(data, root.left);
					}
				}
				else if(data > root.data){
					if(root.right==null){
						root.right = new Node(data);
					}
					else{
						insert(data, root.right);
					}
				}
	}
		 public boolean contains(int data, Node root){
			 if(data == root.data){
				 return true;
			 }
			 else if ( data > root.data){
				 if(root.right != null){
				return contains(data, root.right);
				 }
				 else{
					 return false;
				 }
			 }
			 else {
				 if(root.left != null)
				 {
				return contains(data, root.left);
				 }
				 else{
					 return false;
				 }
			 }
		 }
		 
		 public void printTree(Node root){
			 if(root != null){
				 printTree(root.left);
			     System.out.print (root.data + " |");
				 printTree(root.right);
			 }
		 }
 }
public class BinarySearchTree {

	public BinarySearchTree() {
	Node root = new Node(20);
	root.insert(21, root);
	root.insert(11, root);
	root.insert(1, root);

	root.insert(33, root);
	root.insert(3, root);
	root.printTree(root);
	System.out.println();
	System.out.println("Does tree contain 5?"+ root.contains(5, root));
	System.out.println("Does tree contain 33?"+ root.contains(33, root));
	}
	

	
}
