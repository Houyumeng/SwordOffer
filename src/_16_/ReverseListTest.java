package _16_;

public class ReverseListTest {

	public static void main(String[] args) {
		ListNode p1 = new ListNode();
		ListNode p2 = new ListNode();
		ListNode p3 = new ListNode();
		ListNode p4 = new ListNode();
		p1.next = p2;
		p1.data = 1;
		p2.next = p3;
		p2.data = 2;
		p3.next = p4;
		p3.data = 3;
		p4.next = null;
		p4.data = 4;
		ListNode pHead = ReverseList.reverseList(p1);
		System.out.println(pHead.data);
	}

}
