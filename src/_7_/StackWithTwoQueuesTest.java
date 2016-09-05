package _7_;

public class StackWithTwoQueuesTest {

	public static void main(String[] args) {
		StackWithTwoQueues<String> sq = new StackWithTwoQueues<>();
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
