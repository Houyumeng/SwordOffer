package _31_;

public class GreatestSumOfSubArrayTest {

	public static void main(String[] args) {
		int[] array = { 1, -2, 3, 4, 9, -5, 6 };
		int sum;
		try {
			sum = GreatestSumOfSubArray.greatestSumOfSubArray1(array);
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
