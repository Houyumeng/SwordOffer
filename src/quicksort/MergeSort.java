package quicksort;

/*�鲢����
 * ����ռ䣬ʹ���СΪ�����Ѿ���������֮�ͣ��ÿռ�������źϲ�������� 
 * �趨����ָ�룬���λ�÷ֱ�Ϊ�����Ѿ��������е�βλ��
 * �Ƚ�����ָ����ָ���Ԫ�أ�ѡ����Դ��Ԫ�ط��뵽�ϲ��ռ䣬���ƶ�ָ�뵽��һλ��
 * �ظ�����3ֱ��ĳһָ��ﵽ������ʼλ��
 * ����һ����ʣ�µ�����Ԫ��ֱ�Ӹ��Ƶ��ϲ�����β*/
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
