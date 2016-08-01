/*
 * 输入一个链表的头结点，翻转改链表并输出翻转后的头结点
 */
package chapter3._16_;

public class ReverseList {
	public static ListNode reverseList(ListNode pHead) {
		ListNode pPre = null;
		ListNode pNow = pHead;
		ListNode pReversedHead = null;
		while (pNow != null) {
			ListNode pNext = pNow.next;
			if (pNext == null) {
				pReversedHead = pNow;
			}
			pNow.next = pPre;
			pPre = pNow;
			pNow = pNext;
		}
		return pReversedHead;
	}
}

class ListNode {
	int data;
	ListNode next;
}
