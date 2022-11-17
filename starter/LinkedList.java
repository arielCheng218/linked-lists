package starter;
// Represents singly-linked list in java

class LinkedList {

	Node head;
	Node tail;

	LinkedList(Node headNode) {
		
	}

	void prependNode(Node node) {
		
	}

	void appendNode(Node node) {

	}

	void traverseAndPrint() {
		System.out.println(head.value);
	}	

	public static void main(String[] args) {
		// create a linked list (3 -> 2 -> 1 -> 2)
		Node headNode = new Node(2);
		LinkedList ll = new LinkedList(headNode);
		// traverse through and print
		ll.traverseAndPrint();
	}

}