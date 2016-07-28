package chapter2._8_reversearray;

public class MinTest {

	public static void main(String[] args) {
		int[] a = {};
		int b;
		try {
			b = ReverseArray.min(a);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
