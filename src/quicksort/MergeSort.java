package quicksort;

/*归并排序
 * 申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列 
 * 设定两个指针，最初位置分别为两个已经排序序列的尾位置
 * 比较两个指针所指向的元素，选择相对大的元素放入到合并空间，并移动指针到上一位置
 * 重复步骤3直到某一指针达到序列起始位置
 * 将另一序列剩下的所有元素直接复制到合并序列尾*/
public class MergeSort {
	public static void main(String[] args) {
		int[] array = { 5, 3, 6, 2, 9, 4, 8 };
		try {
			int[] result = mergeSort(array, 0, array.length - 1);
			for (int i : result) {
				System.out.print(i + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int[] mergeSort(int[] array, int start, int end) throws Exception {
		if (array == null || array.length <= 0) {
			throw new Exception("error:invalid input");
		}
		int[] copy = array.clone();
		merge(array, copy, start, end);
		return copy;
	}

	public static int[] merge(int[] array, int[] copy, int start, int end) {
		if (start == end) {
			copy[start] = array[start];
			return copy;
		}
		int length = (end - start) >> 1;
		merge(copy, array, start, start + length);
		merge(copy, array, start + length + 1, end);
		int i = start + length;
		int j = end;
		int indexofCopy = end;
		while (i >= start && j >= start + length + 1) {
			if (array[i] > array[j]) {
				copy[indexofCopy--] = array[i--];
			} else {
				copy[indexofCopy--] = array[j--];
			}
		}
		while (i >= start) {
			copy[indexofCopy--] = array[i--];
		}
		while (j >= start + length + 1) {
			copy[indexofCopy--] = array[j--];
		}
		return copy;
	}
}
