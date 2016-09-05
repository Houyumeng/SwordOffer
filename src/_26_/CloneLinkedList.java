package _26_;
/*
 * 复制复杂链表，该复杂链表不仅有指向下一个结点的指针，也有任意指向的指针*/

public class CloneLinkedList {
	public static ListNode cloneComelexLinkedList(ListNode head){
		if (head == null) {
			return null;
		}
		cloneNodes(head);
		cloneSibling(head);
		return reconnectLinkedList(head);
	}

	// 第一步：仅复制结点
	public static void cloneNodes(ListNode head) {
		ListNode node = head;
		while (node != null) {
			ListNode clonednode = new ListNode();
			// 复制数据到clonedPNode
			clonednode.data = node.data;
			clonednode.next = node.next;
			clonednode.sibling = null;
			node.next = clonednode;
			node = clonednode.next;
		}
	}

	// 第二步：复制pSibling
	public static void cloneSibling(ListNode head) {
		ListNode node = head;
		while (node != null) {
			if (node.sibling != null) {

				node.next.sibling = node.sibling.next;
			}
			node = node.next.next;
		}
	}

	// 第三步：拆分链表
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