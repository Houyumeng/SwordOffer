package _37_;

public class getFirstCommonNodeTest {

	public static void main(String[] args) {
		ListNode headNode = new ListNode();
		headNode.data = 1;
		ListNode node2 = new ListNode();
		node2.data = 2;
		ListNode node3 = new ListNode();
		node3.data = 3;
		ListNode node3_1 = new ListNode();
		node3_1.data = 7;
		ListNode node4 = new ListNode();
		node4.data = 4;
		ListNode node5 = new ListNode();
		node5.data = 5;
		headNode.next = node2;
		node2.next = node3;
		node3.next = node4;
		node3_1.next = node4;
		node4.next = node5;
		node5.next = null;
		ListNode resultNode;
		try {
			resultNode = FirstCommonNode.getFirstCommonNode(headNode, node3_1);
			System.out.println(resultNode.data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
