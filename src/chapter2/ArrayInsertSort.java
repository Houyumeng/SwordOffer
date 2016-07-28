package chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//´íÎó
public class ArrayInsertSort {
	public static Object[] insertSort(int[] a1, int[] a2) {
		List<int[]> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		Object[] a3 = list.toArray();
		Arrays.sort(a3);
		return a3;
	}
}
