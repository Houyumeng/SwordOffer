package chapter2;

public class _7_StackWithTwoQueuesTest {

	public static void main(String[] args) {
		_7_StackWithTwoQueues<String> sq = new _7_StackWithTwoQueues<>();
		sq.push("a");
		sq.push("b");
		sq.push("c");
		sq.pop();
		sq.pop();
		sq.pop();
		String str = sq.pop();
		System.out.println(str);
	}

}
