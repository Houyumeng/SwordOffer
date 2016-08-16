package chapter2._8_quicksort;

public class QuickSort {
	public static <T extends Comparable<? super T>> void qSort(T[] a, int left, int right) throws Exception {
		if (a == null || left < 0 || right > a.length || left > right) {
			throw new Exception("输入有误");
		}
		// if (left + 10 <= right) {
		T pivot = median3(a, left, right);
		int i = left + 1;
		int j = right - 2;
		for (;;) {
			while (i<=right-2&&a[i].compareTo(pivot) < 0) {
				i++;
			}
			while (j>=left+1&&a[j].compareTo(pivot) > 0) {
				j--;
			}
			if (i <= j) {
				swap(a, i, j);
			} else
				break;
		}
		swap(a, i, right - 1);
		qSort(a, left, i - 1);
		qSort(a, i + 1, right);
		// } else {
		// insertionSort(a);
		// }
	}

	// 快速排序的三值取中
	public static <T extends Comparable<? super T>> T median3(T[] a, int left, int right) {
		int center = (left + right) / 2;
		if (a[center].compareTo(a[left]) < 0)
			swap(a, left, center);
		if (a[right].compareTo(a[left]) < 0)
			swap(a, left, right);
		if (a[right].compareTo(a[center]) < 0)
			swap(a, center, right);

		swap(a, center, right - 1);
		return a[right - 1];
	}

	// 交换两数
	public static <T> void swap(T[] a, int i, int j) {
		T temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

	// 插入排序
	public static <T extends Comparable<? super T>> void insertionSort(T[] a) {
		int j;
		for (int p = 1; p < a.length; p++) {
			T temp = a[p];
			for (j = p; j > 0 && temp.compareTo(a[j - 1]) < 0; j--) {
				a[j] = a[j - 1];
				a[j] = temp;
			}
		}
	}
}
