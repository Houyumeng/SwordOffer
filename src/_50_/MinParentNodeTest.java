package _50_;

public class MinParentNodeTest {

	public static void main(String[] args) {
		ListNode node1 = new ListNode();
		node1.data = 13;
		ListNode node2 = new ListNode();
		node2.data = 8;
		ListNode node3 = new ListNode();
		node3.data = 18;
		ListNode node4 = new ListNode();
		node4.data = 6;
		ListNode node5 = new ListNode();
		node5.data = 10;
		ListNode node6 = new ListNode();
		node6.data = 2;
		ListNode node7 = new ListNode();
		node7.data = 7;
		ListNode node8 = new ListNode();
		node8.data = 9;
		ListNode node9 = new ListNode();
		node9.data = 12;
		ListNode node10 = new ListNode();
		node10.data = 14;
		ListNode node11 = new ListNode();
		node11.data = 20;
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node4.left = node6; 
		node4.right = node7;
		node5.left = node8;
		node5.right = node9;
		node3.left = node10;
		node3.right = node11;
		ListNode resultNode = MinParentNode.getMinParentNode(node1, node7, node6);
		System.out.println(resultNode.data);
	}

}
