package chapter2;

import java.util.Stack;

//	输入链表的头结点，从尾到头打印链表
//用栈实现，循环方式较好
public class PrintListReversingly {
	public static void printListReverse(ListNode HeadNode) {
		ListNode node = HeadNode;
		Stack<ListNode> sNode = new Stack<ListNode>();
		while (node != null) {
			sNode.push(node);
			node = node.next;
		}
		while (!sNode.isEmpty()) {
			System.out.println(sNode.pop().data);
		}

	}

	// 递归实现
	public static void prinListReverse1(ListNode HeadNode) {
		ListNode node = HeadNode;
		if (node != null) {
			prinListReverse1(node.next);
			System.out.println(node.data);
		}

	}
}

class ListNode {
	int data;
	ListNode next;
}
