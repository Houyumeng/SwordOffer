package _26_;
/*
 * ���Ƹ��������ø�����������ָ����һ������ָ�룬Ҳ������ָ���ָ��*/

public class CloneLinkedList {
	public static ListNode cloneComelexLinkedList(ListNode head){
		if (head == null) {
			return null;
		}
		cloneNodes(head);
		cloneSibling(head);
		return reconnectLinkedList(head);
	}

	// ��һ���������ƽ��
	public static void cloneNodes(ListNode head) {
		ListNode node = head;
		while (node != null) {
			ListNode clonednode = new ListNode();
			// �������ݵ�clonedPNode
			clonednode.data = node.data;
			clonednode.next = node.next;
			clonednode.sibling = null;
			node.next = clonednode;
			node = clonednode.next;
		}
	}

	// �ڶ���������pSibling
	public static void cloneSibling(ListNode head) {
		ListNode node = head;
		while (node != null) {
			if (node.sibling != null) {

				node.next.sibling = node.sibling.next;
			}
			node = node.next.next;
		}
	}

	// ���������������
	public static ListNode reconnectLinkedList(ListNode head) {
		ListNode headNode = head;
		ListNode node = headNode;
		ListNode cloneHeadNode = head.next;
		ListNode cloneNode = cloneHeadNode;
		while (cloneNode.next != null) {
			node.next = cloneNode.next;
			node = node.next;
			cloneNode.next = node.next;
			cloneNode = cloneNode.next;
		}
		return cloneHeadNode;
		/*
		 * ListNode node = head; ListNode cloneNode = null; ListNode cloneHead =
		 * null; if (node != null) { cloneHead = cloneNode = node.next;
		 * node.next = cloneNode.next; node = node.next; } while (node != null)
		 * { cloneNode.next = node.next; cloneNode = cloneNode.next; node.next =
		 * cloneNode.next; node = node.next; } return cloneHead;
		 */
	}
}

class ListNode {
	int data;
	ListNode next;
	ListNode sibling;
}