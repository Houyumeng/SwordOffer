package _7_;

public class QueueWithTwoStacksTest {

	public static void main(String[] args) {
		QueueWithTwoStacks<String> q = new QueueWithTwoStacks<>();
		q.appendTail("hello");
		q.appendTail("world");
		q.appendTail("qq");
		String str;
		try {
			str = q.deleteHead();
			System.out.println(str);
			q.appendTail("alibaba");
			String str1 = q.deleteHead();
			System.out.println(str1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
