package chapter3._15_;

/*
 *输出链表倒数第K个结点，注意鲁棒性 
 */
public class FindNode {
	public static ListNode findNodeOfKFromTail(ListNode headNode, int k) {
		if (headNode == null || k <= 0) {
			return null;
		}
		ListNode pi = headNode;
		ListNode pj = headNode;
		for (int i = 1; i < k; i++) {
			if (pi.next != null) {
				pi = pi.next;
			} else {
				return null;
			}
		}
		for (int i = k;; i++) {
			if (pi.next == null) {
				break;
			}
			pi = pi.next;
			pj = pj.next;
		}
		return pj;
	}
}

class ListNode {
	int data;
	ListNode next;
}