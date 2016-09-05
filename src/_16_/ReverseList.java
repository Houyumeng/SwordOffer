/*
 * 输入一个链表的头结点，翻转改链表并输出翻转后的头结点
 */
package _16_;

public class ReverseList {
	public static ListNode reverseList(ListNode pHead) {
		ListNode pre = null;
		ListNode now = pHead;
		ListNode reversedHead = null;
		while (now != null) {
			ListNode node = now.next;
			if (node == null) {
				reversedHead = now;
			}
			now.next = pre;
			pre = now;
			now = node;
		}
		return reversedHead;
	}
}

class ListNode {
	int data;
	ListNode next;
}
