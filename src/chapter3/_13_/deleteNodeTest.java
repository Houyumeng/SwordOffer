package chapter3._13_;

//测试结果仅结点内部数据域改变(不确定结果是否正确)
public class deleteNodeTest {

	public static void main(String[] args) {
		ListNode headNode = new ListNode();
		headNode.data = 1;
		ListNode node2 = new ListNode();
		node2.data = 2;
		ListNode node3 = new ListNode();
		node3.data = 3;
		ListNode node4 = new ListNode();
		node4.data = 4;
		ListNode node5 = new ListNode();
		node5.data = 5;
		headNode.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		DeleteNode.deleteNode(headNode, node5);
		System.out.println(node4.next);
	}

}
//
// ListNode head=new ListNode();
// ListNode second=new ListNode();
// ListNode third=new ListNode();
// head.nextNode=second;
// second.nextNode=third;
// head.data=1;
// second.data=2;
// third.data=3;
// DeleteNode testDeleteNode=new DeleteNode();
// testDeleteNode.deleteNode(head, third);
// System.out.println(head.nextNode.nextNode);
