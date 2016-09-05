package _26_;

public class CloneLinkedListTest {

	public static void main(String[] args) {
		ListNode head = new ListNode();
		ListNode node2 = new ListNode();
		ListNode node3 = new ListNode();
		ListNode node4 = new ListNode();

		head.data = 1;
		node2.data = 3;
		node3.data = 5;
		node4.data = 7;

		head.next = node2;
		// pSibling指向结点自身
		head.sibling = head;
		node2.next = node3;
		node2.sibling = node4;
		node3.next = node4;

		ListNode clonedHead = CloneLinkedList.cloneComelexLinkedList(null);
		System.out.println(clonedHead);
	}

}
