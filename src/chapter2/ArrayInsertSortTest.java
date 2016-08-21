package chapter2;

import java.util.List;

public class ArrayInsertSortTest {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 6 };
		int[] a2 = { 5, 8, 10, 13, 15 };
		List<Integer> result;
		try {
			result = ArrayInsertSort.insertSort(a1, a2);
			for (Integer i : result) {
				System.out.print(i + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
