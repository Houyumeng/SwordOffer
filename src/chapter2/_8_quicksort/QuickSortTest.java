package chapter2._8_quicksort;

public class QuickSortTest {

	public static void main(String[] args) throws Exception {
		Integer[] a = { 13, 3, 7, 10, 9, 8 };
		QuickSort.qSort(a, 0, a.length - 1);
		System.out.println("after sort:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

	}
}
