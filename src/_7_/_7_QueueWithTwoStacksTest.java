package _7_;

public class _7_QueueWithTwoStacksTest {

	public static void main(String[] args) {
		_7_QueueWithTwoStacks<String> q = new _7_QueueWithTwoStacks<>();
		q.appendTail("hello");
		q.appendTail("world");
		q.appendTail("qq");
		String str;
		try {
			str = q.deleteHead();
			System.out.println(str);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
