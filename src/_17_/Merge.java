package _17_;

/*
 *�ϲ�������������������ϲ�֮����Ȼ�������У����Ծ������� 
 *�ݹ�
 *������ȽϺϲ�
 *�½�����洢�ϲ�����
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