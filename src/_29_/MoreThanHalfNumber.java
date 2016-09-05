package _29_;

/*
 * 数组中出现次数超过数组长度一半的数字，存在请输出，不存在返回-1
 * 数组工具排序后数组中间数出现次数是否超过数组长度*/
import java.util.Arrays;

public class MoreThanHalfNumber {

	// 保存当前数和次数O(n)(推荐)
	public static int moreThanHalfNumber_Solution2(int[] array) throws Exception {

		if (array == null) {
			throw new Exception("invalid array");
		}

		int count = 1;
		int num = array[0];

		for (int i = 1; i < array.length; i++) {
			if (count == 0) {
				num = array[i];
				count = 1;
			} else if (num != array[i]) {
				count--;
			} else {
				count++;
			}
		}
		if (!check(array, num)) {
			throw new Exception("error:invalid input");
		}

		return num;
	}

	public static boolean check(int[] array, int num) {
		int a = array[0];
		int times = 0;
		for (int i = 0; i < array.length; i++) {
			if (a == array[i]) {
				times++;
			}
		}
		if (times <= array.length >> 1) {
			return false;
		}
		return true;
	}

	// 时间复杂度为O(nlogn)
	public static int moreThanHalfNumber_Solution1(int[] array) throws Exception {
		if (array == null) {
			throw new Exception("invalid array");
		}
		int n = array.length;
		// 排序
		Arrays.sort(array);
		// 排序后的中间数
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
