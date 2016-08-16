package _8_reversearray;

//旋转数组输出最小值
public class ReverseArray {
	public static int min(int[] a) throws Exception {
		if (a == null || a.length <= 0) {
			throw new Exception("输入数组异常！");
		}
		int index1 = 0;
		int index2 = a.length - 1;
		if (a[index2] > a[index1]) {
			return a[index1];
		}
		while (index2 - index1 > 1) {
			int mid = (index1 + index2) / 2;
			// 当a[index1]==a[mid]==a[index2]时,用顺序查找
			if (a[index1] == a[mid] && a[mid] == a[index2]) {
				return minInorder(a, index1, index2);
			}
			if (a[mid] >= a[index1]) {
				index1 = mid;
			} else {
				index2 = mid;
			}
		}
		return a[index2];
	}

	// 当a[index1]==a[mid]==a[index2]时，只能用顺序查找
	private static int minInorder(int[] a, int index1, int index2) {
		int result = a[index1];
		for (int i = index1; i <= index2; i++) {
			result = (a[i] < result) ? a[i] : result;
		}
		return result;
	}
}
