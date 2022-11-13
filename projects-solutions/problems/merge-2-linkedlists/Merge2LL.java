
class Merge2LL {

	// NOTE: Do not define this class if you're using the Leetcode editor. It is already defined.
	// The error squiggles in my IDE were annoying me so I put this here.
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// Create a "dummy" node to loop through the lists.
		ListNode dummy = new ListNode();
		// Create a reference to dummy before it's changed so we can return the answer.
		ListNode ans = dummy;
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				dummy.next = list1;
				list1 = list1.next;
			} else {
				dummy.next = list2;
				list2 = list2.next;
			}
			dummy = dummy.next;
		}
		// If we have reached the end of one of the linked lists, we can just
		// make the end of dummy point to the next index of the list that's left. 
		// E.g. (3) -> (4) -> (5) is left, just make dummy.next = (3)
		if (list1 != null) {
			dummy.next = list1;
		} else {
			dummy.next = list2;
		}
		// The head of the list we want to return is the "next" of the dummy
		return ans.next;
	}
}