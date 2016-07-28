package chapter2;

public class PrintListReversinglyTest {

	public static void main(String[] args) {
		ListNode node1 = new ListNode();
		ListNode node2 = new ListNode();
		ListNode node3 = new ListNode();
		node1.data = 1;
		node2.data = 3;
		node3.data = 5;
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		PrintListReversingly.printListReverse(node1);
//		µÝ¹éµ÷ÓÃ
		System.out.println("µÝ¹éºó£º");
		PrintListReversingly.prinListReverse1(node1);
	}

}
