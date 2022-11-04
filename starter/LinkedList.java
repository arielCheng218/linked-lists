package starter;
// Represents singly-linked list in java

class LinkedList {

	Node head;
	Node tail;

	LinkedList(Node headNode) {
		head = headNode;
		tail = headNode;
	}

	void prependNode(Node node) {

	}

	void appendNode(Node node) {
		tail.next = node;
		tail = tail.next;
	}

	void traverseAndPrint() {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.value + " -> ");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		// create a linked list (3 -> 2 -> 1 -> 2)
		LinkedList ll = new LinkedList(new Node(3));
		ll.appendNode(new Node(2));
		ll.appendNode(new Node(1));
		ll.appendNode(new Node(2));
		// traverse through and print
		ll.traverseAndPrint();
	}

}