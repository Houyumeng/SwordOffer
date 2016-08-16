package _41_1;

public class NumbersWithSum {
	public static String getNumbersWithSum(int[] array, int length, int sum) throws Exception {
		if (array == null || length < 0) {
			throw new Exception("invalid input");
		}
		int i = 0;
		int j = array.length - 1;
		while (i < j) {
			if (array[i] + array[j] < sum) {
				i++;
			} else if (array[i] + array[j] > sum) {
				j--;
			} else
				return "two numbers are  " + array[i] + "," + array[j];
		}
		return null;
	}
}
