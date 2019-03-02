


//Create Node Class
public class BinarySearchTree{
	public static void main (String args[]) {
		Node root = new Node(10);
		root.insert(11);
		root.insert(12);
		root.insert(2);
		root.insert(4);
		
		System.out.println("Does BST contain 5?" + root.contains(5));
		
		System.out.println("Does BST contain 5?" + root.contains(11));
		
		System.out.println("Does BST contain 5?" + root.contains(10));
		
		root.printInOrder();
	}
}

class Node{
	//The node class has three variables, A right not, a left node and a data
	Node left, right;
	int data;
	
	
	public Node(int data) {
		this.data = data;
	}
	
	
	public void insert(int data) {
	
		//Check to see if the data we want to insert is less than the data of the current Node
		if(this.data > data) {
			
			//If there is no left node, we can create it using the data we want to insert
			if(this.left == null) {
				this.left = new Node(data);
			}
			
			//If there is a left node, we are recursively repeating the same process on the left node
			else {
				this.left.insert(data);
			}
		}
		
		//Check to see if data in current Node is less than data we are inserting
		if(this.data < data) {
			
			//If there is no right Node, we can create one with the new data
			if(this.right == null) {
				this.right = new Node(data);
			}
			
			//If there is a right Node, we are recursively repeating the same process of the right node
			else {
				this.right.insert(data);
			}
		}
		
		//Case if same value will be ignored as duplicate values are not valid. 
	}
	
	
	public boolean contains (int data) {
		
		//Case of Node data equals searching data
		if(this.data == data) {
			return true;
		}
		
		//Case of Node data being less than searching data
		else if(this.data < data) {
			if(this.left == null) {
				return false;
			}
			else {
				return this.left.contains(data);
			}
			
		}
		else {
			if(this.right == null) {
				return false;
			}
			else {
				return this.right.contains(data);
			}
		}
	}
	
	public void printInOrder() {
		if(left!= null) {
			left.printInOrder();
		}
		System.out.println(data);
		if(right!= null) {
			right.printInOrder();
		}
	}
}