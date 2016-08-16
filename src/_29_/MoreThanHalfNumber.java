package _29_;

/*
 * 数组中出现次数超过数组长度一半的数字，存在请输出，不存在返回0
 * 数组工具排序后数组中间数出现次数是否超过数组长度*/
import java.util.Arrays;

public class MoreThanHalfNumber {
	public static int moreThanHalfNumber_Solution(int[] array) throws Exception {
		if (array == null) {
			throw new Exception("invalid array");
		}
		int n = array.length;
//		排序
		Arrays.sort(array);
//		排序后的中间数
		int ans = array[n / 2];
		int counts = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] == ans) {
				counts++;
			}
		}
		return (counts > (n / 2)) ? ans : 0;
	}
}
