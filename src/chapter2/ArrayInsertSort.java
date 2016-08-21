package chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*将两个数组合并并排序*/
public class ArrayInsertSort {
	public static List<Integer> insertSort(int[] a1, int[] a2) throws Exception {
		if (a1 == null || a2 == null || a1.length < 0 || a2.length < 0) {
			throw new Exception("error invalid input");
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a1.length; i++) {
			list.add(a1[i]);
		}
		for (int i = 0; i < a2.length; i++) {
			list.add(a2[i]);
		}
		Collections.sort(list);
		return list;
	}
}
