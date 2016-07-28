package chapter2;

public class ArrayInsertSortTest {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 6 };
		int[] a2 = { 5, 8, 10, 13, 15 };
		Object[] a = ArrayInsertSort.insertSort(a1, a2);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
