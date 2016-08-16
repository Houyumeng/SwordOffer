package _38_;

import java.util.Arrays;

/*
 * ¶ş·Ö²éÕÒ*/
public class BinarySearch {
	public static void main(String[] args) {
		int[] array = { 2, 6, 7, 4, 3, 9 };
		try {
			int result = search(array, 4);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int search(int[] array, int k) throws Exception {
		if (array == null || array.length < 0) {
			throw new Exception("invalid input");
		}
		Arrays.sort(array);
		return search(array, k, 0, array.length - 1);
	}

	private static int search(int[] array, int k, int start, int end) {
		if (start > end) {
			return -1;
		}
		int middle = (start + end) >> 1;
		int center = array[middle];
		if (k == center) {
			return middle;
		} else if (k < center) {
			return search(array, k, start, middle - 1);
		} else {
			return search(array, k, middle + 1, end);
		}
	}
}
