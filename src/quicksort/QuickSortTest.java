package quicksort;

public class QuickSortTest {

	public static void main(String[] args) throws Exception {
		Integer[] a = { 5, 3, 6, 2, 9, 4, 8 };
		try {
			QuickSort.qSort(a, 0, a.length - 1);
			System.out.println("after sort:");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
