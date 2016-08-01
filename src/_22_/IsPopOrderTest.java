package _22_;

public class IsPopOrderTest {

	public static void main(String[] args) {
		int[] pushA = { 1, 2, 3, 4, 5 };
		int[] popA = { 3, 4, 5, 2, 1 };
		try {
			boolean b = IsPopOrder.isPopOrder(pushA, popA);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
