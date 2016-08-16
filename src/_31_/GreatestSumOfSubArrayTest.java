package _31_;

public class GreatestSumOfSubArrayTest {

	public static void main(String[] args) {
		int[] array = null;
		int sum;
		try {
			sum = GreatestSumOfSubArray.greatestSumOfSubArray1(array);
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
