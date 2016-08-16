package _41_1;

public class NumbersWithSumTest {

	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 7, 11, 15 };
		try {
			String str = NumbersWithSum.getNumbersWithSum(array, array.length, 15);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
