package _40_;

//һ��������ֻ���������ǲ�ͬ�ģ��������ֶ��ǳɶԳ��ֵģ������������
public class NumbersAppearsOnce {
	public static String getNumbersAppearsOnce(int[] array, int length) throws Exception {
		if (array == null || length < 0) {
			throw new Exception("invalid input");
		}
		int result = 0;
		for (int i = 0; i < length; i++) {
			result ^= array[i];
		}
		int indexOf1 = getIndexOf1(result);
		int m = 0;
		int n = 0;
		for (int j = 0; j < length; j++) {
			if (is1Or0(array[j], indexOf1) == 1) {
				m ^= array[j]; //array[j]^0==array[j]
			} else {
				n ^= array[j];
			}
		}
		return "two numbers are :" + m + "," + n;
	}

	// ����������1���ֵ�λ��
	public static int getIndexOf1(int num) {
		int indexOf1 = 0;
		while ((num & 1) == 0 && indexOf1 < 32) {
			num = num >> 1;
			indexOf1++;
		}
		return indexOf1;
	}

	// �ж�����������indexλ��1����0
	public static int is1Or0(int num, int indexOf1) {
		num = num >> indexOf1;
		return (num & 1);
	}
}
