package _31_;
/*
 * 求数组中和最小的子数组的和*/
public class GreatestSumOfSubArray {
//	方法一：分析数组规律
	public static int greatestSumOfSubArray1(int[] array) throws Exception{
		if (array == null) {
			throw new Exception("invalid input");
		}
		int sum = 0;
		int tempSum = 0;
		for (int i = 0; i < array.length; i++) {
			if (sum <= 0) {
				sum = array[i];
			} else {
				sum += array[i];
			}
			if (sum > tempSum) {
				tempSum = sum;
			}
		}
		return tempSum;
	}
//	方法二：动态规划法
		
	
}
