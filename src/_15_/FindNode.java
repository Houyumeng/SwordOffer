package _15_;

/*
 *�����������K����㣬ע��³���� 
 */
public class FindNode {
	public static ListNode findNodeOfKFromTail(ListNode headNode, int k) {
		if (headNode == null || k <= 0) {
			return null;
		}
		ListNode iNode = headNode;
		ListNode jNode = headNode;
		for (int i = 1; i < k; i++) {
			if (iNode.next != null) {
				iNode = iNode.next;
			} else {
				return null;
			}
		}
		while (iNode.next != null) {
			iNode = iNode.next;
			jNode = jNode.next;
		}
		return jNode;
	}
}

class ListNode {
	int data;
	ListNode next;
}