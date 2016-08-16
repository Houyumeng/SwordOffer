package _31_;
/*
 * �������к���С��������ĺ�*/
public class GreatestSumOfSubArray {
//	����һ�������������
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
//	����������̬�滮��
		
	
}
