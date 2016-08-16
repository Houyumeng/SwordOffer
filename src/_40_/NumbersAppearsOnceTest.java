package _40_;

public class NumbersAppearsOnceTest {

	public static void main(String[] args) {
		int[] array = { 2, 4, 3, 6, 3, 2, 5, 5 };
		String str;
		try {
			str = NumbersAppearsOnce.getNumbersAppearsOnce(array, array.length);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
