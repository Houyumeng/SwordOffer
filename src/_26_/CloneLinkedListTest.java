package _26_;

public class CloneLinkedListTest {

	public static void main(String[] args) {
		ListNode pHead = new ListNode();
		ListNode node2 = new ListNode();
		ListNode node3 = new ListNode();
		ListNode node4 = new ListNode();
		pHead.data = 1;
		node2.data = 3;
		node3.data = 5;
		node4.data = 7;
		pHead.pNext = node2;
//		pSibling指向结点自身
		pHead.pSibling = pHead;
		node2.pNext = node3;
		node2.pSibling = node4;
		node3.pNext = node4;
		node4.pNext = null;
		ListNode clonedHead = CloneLinkedList.cloneComelexLinkedList(pHead);
		System.out.println(clonedHead.pSibling.data);
	}

}
