package _26_;
/*复制复杂链表，该复杂链表不仅有指向下一个结点的指针，也有任意指向的指针*/
public class CloneLinkedList {
	public static ListNode cloneComelexLinkedList(ListNode pHead) {
		cloneNodes(pHead);
		cloneSibling(pHead);
		return reconnectLinkedList(pHead);
	}

	// 第一步：仅复制结点
	public static void cloneNodes(ListNode pHead) {
		ListNode pNode = pHead;
		while (pNode != null) {
			ListNode clonedPNode = new ListNode();
			// 复制数据到clonedPNode
			clonedPNode.data = pNode.data;
			clonedPNode.pNext = pNode.pNext;
			clonedPNode.pSibling = null;
			pNode.pNext = clonedPNode;
			pNode = clonedPNode.pNext;
		}
	}

	// 第二步：复制pSibling
	public static void cloneSibling(ListNode pHead) {
		ListNode pNode = pHead;
		while (pNode != null) {
			if (pNode.pSibling != null) {

				pNode.pNext.pSibling = pNode.pSibling.pNext;
			}
			pNode = pNode.pNext.pNext;
		}
	}

	// 第三步：拆分链表
	public static ListNode reconnectLinkedList(ListNode pHead) {
		ListNode pNode = pHead;
		ListNode pCloneNode = null;
		ListNode pCloneHead = null;
		if (pNode != null) {
			pCloneHead = pCloneNode = pNode.pNext;
			pNode.pNext = pCloneNode.pNext;
			pNode = pNode.pNext;
		}
		while (pNode != null) {
			pCloneNode.pNext = pNode.pNext;
			pCloneNode = pCloneNode.pNext;
			pNode.pNext = pCloneNode.pNext;
			pNode = pNode.pNext;
		}
		return pCloneHead;
	}
}

class ListNode {
	int data;
	ListNode pNext;
	ListNode pSibling;
}