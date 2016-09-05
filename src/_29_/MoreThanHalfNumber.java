package _29_;

/*
 * �����г��ִ����������鳤��һ������֣�����������������ڷ���-1
 * ���鹤������������м������ִ����Ƿ񳬹����鳤��*/
import java.util.Arrays;

public class MoreThanHalfNumber {

	// ���浱ǰ���ʹ���O(n)(�Ƽ�)
	public static int moreThanHalfNumber_Solution2(int[] array) throws Exception {

		if (array == null) {
			throw new Exception("invalid array");
		}

		int count = 1;
		int num = array[0];

		for (int i = 1; i < array.length; i++) {
			if (count == 0) {
				num = array[i];
				count = 1;
			} else if (num != array[i]) {
				count--;
			} else {
				count++;
			}
		}
		if (!check(array, num)) {
			throw new Exception("error:invalid input");
		}

		return num;
	}

	public static boolean check(int[] array, int num) {
		int a = array[0];
		int times = 0;
		for (int i = 0; i < array.length; i++) {
			if (a == array[i]) {
				times++;
			}
		}
		if (times <= array.length >> 1) {
			return false;
		}
		return true;
	}

	// ʱ�临�Ӷ�ΪO(nlogn)
	public static int moreThanHalfNumber_Solution1(int[] array) throws Exception {
		if (array == null) {
			throw new Exception("invalid array");
		}
		int n = array.length;
		// ����
		Arrays.sort(array);
		// �������м���
		int ans = array[n / 2];
		int counts = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] == ans) {
				counts++;
			}
		}
		return (counts > (n / 2)) ? ans : 0;
	}
}
