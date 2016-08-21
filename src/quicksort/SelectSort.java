package quicksort;

/*ֱ��ѡ������
 * �õ�һ���������������Ƚϣ��ҵ��ȵ�һ����С�ģ��򽻻�*/
public class SelectSort {
	public static void main(String[] args) {
		int[] array = { 2, 5, 1, 9, 6, 4, 8, 8, 9, 1, 3 };
		// int[] array = null;
		try {
			int[] result = getSort(array, 0);
			for (int i = 0; i < array.length; i++) {
				System.out.print(result[i] + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		try {
			int[] result = getSortByLoop(array);
			for (int i = 0; i < array.length; i++) {
				System.out.print(result[i] + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// 1.�ݹ�ʵ��
	public static int[] getSort(int[] array, int start) throws Exception {
		if (array == null || array.length < 0) {
			throw new Exception("error:invalid input!");
		}
		if (start == array.length - 1) {// �ݹ���ֹ
			return array;
		}
		for (int i = start + 1; i < array.length; i++) {
			if (array[start] > array[i]) {
				int temp = array[start];
				array[start] = array[i];
				array[i] = temp;
			}
		}
		start++;
		getSort(array, start);
		return array;
	}

	// 2.ѭ��ʵ��
	public static int[] getSortByLoop(int[] array) throws Exception {
		if (array == null || array.length < 0) {
			throw new Exception("error:invalid input!");
		}
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}