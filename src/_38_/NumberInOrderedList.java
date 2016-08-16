package _38_;

public class NumberInOrderedList {
	// 寻找第一个k
	public static int getFirstK(int[] array, int k, int start, int end) {
		if (start > end) {
			return -1;
		}
		int centerIndex = (start + end) >>1;
		int center = array[centerIndex];
		if (k == center) {
			if ((centerIndex > 0 && k != array[centerIndex - 1]) || centerIndex == 0) {
				return centerIndex;
			} else
				end = centerIndex - 1;
		} else if (k < center) {
			end = centerIndex - 1;
		} else {
			start = centerIndex + 1;
		}
		return getFirstK(array, k, start, end);
	}

	// 寻找最后一个k
	public static int getLastK(int[] array, int k, int start, int end) {
		if (start > end) {
			return -1;
		}
		int centerIndex = (start + end) >>1;
		int center = array[centerIndex];
		if (k == center) {
			if ((centerIndex < array.length - 1 && k != array[centerIndex + 1]) || centerIndex == array.length - 1) {
				return centerIndex;
			} else
				start = centerIndex + 1;
		} else if (k < center) {
			end = centerIndex - 1;
		} else {
			start = centerIndex + 1;
		}
		return getLastK(array, k, start, end);
	}

	// 输出k的个数
	public static int getCountsOfK(int[] array, int k, int start, int end) throws Exception {
		if (array == null || start < 0 || end > array.length - 1 || start > end) {
			throw new Exception("invalid input");
		}
		int counts = 0;
		int first = getFirstK(array, k, start, end);
		int last = getLastK(array, k, start, end);
		if (first > -1 && last > -1) {
			counts = last - first + 1;
		}
		return counts;
	}
}
