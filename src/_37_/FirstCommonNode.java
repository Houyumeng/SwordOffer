package _37_;

/*
 * 输出两个链表的第一个相同结点*/
public class FirstCommonNode {
	public static ListNode getFirstCommonNode(ListNode headNode1, ListNode headNode2) throws Exception {
		if (headNode1 == null || headNode2 == null) {
			throw new Exception("invalid input");
		}
		int length1 = getListLength(headNode1);
		int length2 = getListLength(headNode2);
		ListNode longList = headNode1;
		ListNode shortList = headNode2;
		int lengthDif = length1 - length2;
		if (length2 >= length1) {
			longList = headNode2;
			shortList = headNode1;
			lengthDif = length2 - length1;
		}
		for (int i = 0; i < lengthDif; i++) {
			longList = longList.next;
		}
		while (longList != shortList && longList != null && shortList != null) {
			longList = longList.next;
			shortList = shortList.next;
		}
		return longList;
	}

	// 获取链表长度
	public static int getListLength(ListNode headNode) {
		int length = 0;
		while (headNode != null) {
			length++;
			headNode = headNode.next;
		}
		return length;
	}
}

// 定义单向链表
class ListNode {
	int data;
	ListNode next;
}