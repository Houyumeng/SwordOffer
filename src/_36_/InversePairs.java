package _36_;

/*
 * 求数组中逆序对的个数*/
public class InversePairs {
	public static int getInversePairs(int[] array) throws Exception {
		if (array == null) {
			throw new Exception("invalid input");
		}
		int[] copy = array.clone();
		return inversePairsCore(array, copy, 0, array.length - 1);
	}

	public static int inversePairsCore(int[] array, int[] copy, int start, int end) {
		// 递归终止条件
		if (start == end) {
			copy[start] = array[start];
			return 0;
		}
		int length = (end - start) >> 1;// 开始位置到结束位置距离
		int left = inversePairsCore(copy, array, start, start + length);
		int right = inversePairsCore(copy, array, start + length + 1, end);
		int i = start + length;
		int j = end;
		int count = 0;
		int indexofCopy = end;// copy数组的下标
		while (i >= start && j >= start + length + 1) {
			if (array[i] > array[j]) {
				copy[indexofCopy] = array[i];
				count += j - (start + length + 1) + 1;
				i--;
				indexofCopy--;
			} else {
				copy[indexofCopy] = array[j];
				j--;
				indexofCopy--;
			}
		}
		for (; i >= start; i--) {
			copy[indexofCopy] = array[i];
		}
		for (; j >= start + length + 1; j--) {
			copy[indexofCopy] = array[j];
		}
		return count + left + right;
	}
}
