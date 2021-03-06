package _14_;

//使整数数组的前半部分全为奇数，后半部分为偶数
public class Reorder {
	public static int[] reorder(int[] a) throws Exception {
		if (a == null || a.length == 0) {
			throw new Exception(" invalid input!");
		}
		int i = 0;
		int j = a.length - 1;
		for (;;) {
			while (!isEven(a[i])) {
				i++;
			}
			while (isEven(a[j])) {
				j--;
			}
			if (i < j) {
				swap(a, i, j);
				i++;
				j--;
			} else
				break;
		}
		return a;
	}

	public static boolean isEven(int n) {
		return (n & 1) == 0;// 偶数
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
