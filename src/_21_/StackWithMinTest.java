package _21_;

public class StackWithMinTest {
	public static void main(String[] args) {
		StackWithMin<Integer> stack = new StackWithMin<>();
		stack.pushNew(11);
		stack.pushNew(3);
		stack.pushNew(4);
		stack.pushNew(1);
		stack.pushNew(2);
		int min = stack.min();
		System.out.println(min);
		try {
			stack.popNew();
			stack.popNew();
			stack.popNew();
			System.out.println(stack.min());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
