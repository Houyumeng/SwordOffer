package _17_;

/*
 *合并两个升序排序的链表，合并之后依然升序排列（面试经常考） 
 *递归
 *逐个结点比较合并
 *新建链表存储合并链表
 */
public class Merge {
	public static ListNode mergeList(ListNode pHead1, ListNode pHead2) {
		ListNode mergedHead = null;
		if (pHead1 == null) {
			return pHead2;
		} else if (pHead2 == null) {
			return pHead1;
		}
		if (pHead1.data < pHead2.data) {
			mergedHead = pHead1;
			mergedHead.next = mergeList(pHead1.next, pHead2);
		} else {
			mergedHead = pHead2;
			mergedHead.next = mergeList(pHead1, pHead2.next);
		}
		return mergedHead;
	}

}

class ListNode {
	int data;
	ListNode next;
}