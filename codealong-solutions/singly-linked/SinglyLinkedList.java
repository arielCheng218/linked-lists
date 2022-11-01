// Represents singly-linked list in java
import starter.Node;

class LinkedList {

	Node head;
	Node tail;

	LinkedList(Node headNode) {
		head = headNode;
		tail = headNode;
	}

	void prependNode(Node node) {
		node.next = head;
		head = node;
	}

	void appendNode(Node node) {
		tail.next = node;
		tail = tail.next;
	}

	void traverseAndPrint() {
		Node current = head;
		while (current != null) {
			System.out.print(current.value); // Print out value of node
			if (current == head || current == tail) {
				System.out.println(" <");
			} else {
				System.out.println();
			}
			current = current.next; // Move to next node
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList(new Node(2));
		ll.appendNode(new Node(1));
		ll.appendNode(new Node(3));
		ll.traverseAndPrint();
	}

}