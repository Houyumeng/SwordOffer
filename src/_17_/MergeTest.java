package _17_;

public class MergeTest {

	public static void main(String[] args) {
		ListNode p1 = new ListNode();
		ListNode p2 = new ListNode();
		ListNode p3 = new ListNode();
		ListNode p4 = new ListNode();
		p1.next = p2;
		p1.data = 1;
		p2.next = p3;
		p2.data = 4;
		p3.next = p4;
		p3.data = 6;
		p4.next = null;
		p4.data = 8;

		ListNode p5 = new ListNode();
		ListNode p6 = new ListNode();
		ListNode p7 = new ListNode();
		ListNode p8 = new ListNode();
		p5.next = p6;
		p5.data = 2;
		p6.next = p7;
		p6.data = 3;
		p7.next = p8;
		p7.data = 7;
		p8.next = null;
		p8.data = 10;
		ListNode node = Merge.mergeList(p1, p5);
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}
