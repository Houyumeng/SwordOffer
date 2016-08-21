package quicksort;

/*快速排序*/
public class QuickSort {
	public static <T extends Comparable<? super T>> void qSort(T[] a, int left, int right) throws Exception {
		if (a == null || left < 0 || right > a.length) {
			throw new Exception("error:invalid input");
		}
		T pivot = a[(left + right) / 2];// 选取中间数作为pivot
		int i = left;
		int j = right;
		do {

			while (i <= right && a[i].compareTo(pivot) < 0) {
				i++;
			}
			while (j >= left && a[j].compareTo(pivot) > 0) {
				j--;
			}
			if (i <= j) {
				swap(a, i, j);
				i++;
				j--;
			} else
				break;
		} while (i <= j);
		if (left <= j) {
			qSort(a, left, j);
		}
		if (right >= i)
			qSort(a, i, right);
	}

	// 交换两数
	public static <T> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
