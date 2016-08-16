package _36_;

/*
 * ������������Եĸ���*/
public class InversePairs {
	public static int getInversePairs(int[] array) throws Exception {
		if (array == null) {
			throw new Exception("invalid input");
		}
		int[] copy = array.clone();
		return inversePairsCore(array, copy, 0, array.length - 1);
	}

	public static int inversePairsCore(int[] array, int[] copy, int start, int end) {
		// �ݹ���ֹ����
		if (start == end) {
			copy[start] = array[start];
			return 0;
		}
		int length = (end - start) >> 1;// ��ʼλ�õ�����λ�þ���
		int left = inversePairsCore(copy, array, start, start + length);
		int right = inversePairsCore(copy, array, start + length + 1, end);
		int i = start + length;
		int j = end;
		int count = 0;
		int indexofCopy = end;// copy������±�
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
