package _26_;
/*���Ƹ��������ø�����������ָ����һ������ָ�룬Ҳ������ָ���ָ��*/
public class CloneLinkedList {
	public static ListNode cloneComelexLinkedList(ListNode pHead) {
		cloneNodes(pHead);
		cloneSibling(pHead);
		return reconnectLinkedList(pHead);
	}

	// ��һ���������ƽ��
	public static void cloneNodes(ListNode pHead) {
		ListNode pNode = pHead;
		while (pNode != null) {
			ListNode clonedPNode = new ListNode();
			// �������ݵ�clonedPNode
			clonedPNode.data = pNode.data;
			clonedPNode.pNext = pNode.pNext;
			clonedPNode.pSibling = null;
			pNode.pNext = clonedPNode;
			pNode = clonedPNode.pNext;
		}
	}

	// �ڶ���������pSibling
	public static void cloneSibling(ListNode pHead) {
		ListNode pNode = pHead;
		while (pNode != null) {
			if (pNode.pSibling != null) {

				pNode.pNext.pSibling = pNode.pSibling.pNext;
			}
			pNode = pNode.pNext.pNext;
		}
	}

	// ���������������
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