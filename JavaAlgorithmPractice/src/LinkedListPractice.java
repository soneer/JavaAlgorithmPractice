
public class LinkedListPractice {

	public LinkedListPractice() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		NodeSingle root = LinkedListPractice.createSinglyLinkedList();
		LinkedListPractice.printLinkedList(root);
		root = LinkedListPractice.reverseSingleLinkedList(root);
		LinkedListPractice.printLinkedList(root);
	}

	public static NodeSingle createSinglyLinkedList() {
		NodeSingle root = new NodeSingle(null, 0);
		NodeSingle current = root;
		for(int i = 1; i <=10; i++) {
			current.next = new NodeSingle(null,i);
			current = current.next;
		}
		return root;
	}
	
	public static NodeSingle reverseSingleLinkedList(NodeSingle root) {
		
		NodeSingle next = null;
		NodeSingle pointer = root.next;
		while(pointer!=null) {
			pointer = root.next;
			root.next = next;
			next = root;
			root = pointer;
		}
		
		
		return next;
	}
	public static void printLinkedList(NodeSingle root) {
		while(root!=null) {
			System.out.println(root.data);
			root=root.next;
		}
	}
}


class NodeSingle{
	NodeSingle next;
int data;

public NodeSingle(NodeSingle next, int data) {
	this.next = next;
	this.data = data;
}
}
