
public class ReverseLinkedList {

	public ReverseLinkedList() {
		// TODO Auto-generated constructor stub
		createList();
	}

	public void createList(){
		//LinkedList<LinkedNode> linkedList = new LinkedList<LinkedNode>();
		
		LinkedNode root = null;
		LinkedNode temp = null;
		for(int i = 0; i < 21; i++){
			if(i == 0){
				root = new LinkedNode(i);
			}
			else{
				temp = root;
				root = new LinkedNode(i);
				root.previous = temp;
			}
		}
		
		root.printLinkedNodes(root);

		root = root.reverseNodes(root);
		root.printLinkedNodes(root);
	}
	
	
}

class LinkedNode{
	LinkedNode previous = null;
	int value;
	
	public LinkedNode(int data){
		this.value = data;
	}
	
	public void printLinkedNodes(LinkedNode x){
		while(x != null){
			System.out.println(x.value);
			x = x.previous;
		}
	}
	
	public LinkedNode reverseNodes(LinkedNode x){
		LinkedNode end = null;
		LinkedNode current = null;
		while(x != null){
			current = x.previous;
			current.previous = x;
			end = current;
			
		}
		return end;
	}
}