package _wrong33_;

/* 有问题！
 * 输入一正整数数组，输出所有数排列出的最小数字*/
public class PrintMinNumber {

	public static void printMinNumber(int[] array) {
		quickSort(array, 0, array.length - 1);
		for (int a : array) {
			System.out.print(a);
		}
	}

	// 快排
	public static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int pivot = medianOf3(array, left, right);
			int i = left + 1;
			int j = right - 1;
			for (;;) {
				while (i <= right - 1 && isSmall(String.valueOf(array[i]), String.valueOf(pivot))) {
					i++;
				}
				while (j >= left + 1 && isSmall(String.valueOf(pivot), String.valueOf(array[j]))) {
					j--;
				}
				if (i <= j) {
					swap(array[i], array[j]);
					i++;
					j--;
				} else
					break;
			}
			swap(array[i], array[right]);
			quickSort(array, left, i - 1);
			quickSort(array, i + 1, right);
		}
	}

	// 三值取中
	public static int medianOf3(int[] array, int left, int right) {
		int center = array[(left + right) / 2];
		if (isSmall(String.valueOf(center), String.valueOf(array[left]))) {
			swap(center, array[left]);
		}
		if (isSmall(String.valueOf(array[right]), String.valueOf(array[left]))) {
			swap(array[right], array[left]);
		}
		if (isSmall(String.valueOf(center), String.valueOf(array[right]))) {
			swap(center, array[right]);
		}
		return array[right];
	}

	// 寻找规律，找出“大小”关系
	public static boolean isSmall(String m, String n) {
		String str1 = m + n;
		String str2 = n + m;
		boolean b = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) < str2.charAt(i)) {
				return true;
			} else if (str1.charAt(i) > str2.charAt(i)) {
				return false;
			}
		}
		return b;
	}

	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
}
