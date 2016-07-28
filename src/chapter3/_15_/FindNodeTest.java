package chapter3._15_;

public class FindNodeTest {

	public static void main(String[] args) {
		ListNode headNode = new ListNode();
		ListNode node2 = new ListNode();
		ListNode node3 = new ListNode();
		ListNode node4 = new ListNode();
		headNode.next = node2;
		headNode.data = 1;
		node2.next = node3;
		node2.data = 2;
		node3.next = node4;
		node3.data = 3;
		node4.next = null;
		node4.data = 4;

		ListNode node = FindNode.findNodeOfKFromTail(headNode, 2);
		System.out.println(node.data);
	}

}
