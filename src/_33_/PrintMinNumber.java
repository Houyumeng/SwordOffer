package _33_;

/*
 * 输入一正整数数组，输出所有数排列出的最小数字*/
public class PrintMinNumber {

	public static void printMinNumber(int[] array) throws Exception {
		if (array == null || array.length <= 0) {
			throw new Exception("error:invalid input");
		}
		quickSort(array, 0, array.length - 1);
		for (int a : array) {
			System.out.print(a);
		}
	}

	// 快速排序
	public static void quickSort(int[] array, int left, int right) {
		int center = (left + right) >> 1;
		int pivot = array[center];
		int i = left;
		int j = right;
		do {
			while (i <= right && isSmall(String.valueOf(array[i]), String.valueOf(pivot))) {
				i++;
			}
			while (j >= left && isSmall(String.valueOf(pivot), String.valueOf(array[j]))) {
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			} else {
				break;
			}
		} while (i <= j);
		if (i <= right) {
			quickSort(array, i, right);
		}
		if (j >= left) {
			quickSort(array, left, j);
		}
	}

	// 确定比较规则
	public static boolean isSmall(String m, String n) {
		String left = m + n;
		String right = n + m;
		int i = 0;
		while (i < left.length()) {
			if (left.charAt(i) == right.charAt(i)) {
				i++;
			} else if (left.charAt(i) < right.charAt(i)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}