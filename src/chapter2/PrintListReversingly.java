package chapter2;

import java.util.Stack;

//	���������ͷ��㣬��β��ͷ��ӡ����
//��ջʵ�֣�ѭ����ʽ�Ϻ�
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

	// �ݹ�ʵ��
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
