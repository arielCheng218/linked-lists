
class DoublyLinkedList {
	
	DoubleNode head;
	DoubleNode tail;

	DoublyLinkedList(DoubleNode headNode) {
		head = headNode;
		tail = headNode;
	}

	void prependNode(DoubleNode node) {
		node.next = head;
		head.prev = node;
		head = node;
	}

	void appendNode(DoubleNode node) {
		tail.next = node;
		node.prev = tail;
		tail = node;
	}

	void traverseForward() {
		DoubleNode current = head;
		System.out.println("Traversing forward:");
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

	void traverseBackward() {
		DoubleNode current = tail;
		System.out.println("Traversing backwards:");
		while (current != null) {
			System.out.println(current.value);
			current = current.prev;
		}
	}

	public static void main(String[] args) {
		DoubleNode headNode = new DoubleNode(1);
		DoublyLinkedList ll = new DoublyLinkedList(headNode);
		ll.appendNode(new DoubleNode(2));
		ll.appendNode(new DoubleNode(4));
		ll.traverseForward();
		ll.traverseBackward();
	}

}
