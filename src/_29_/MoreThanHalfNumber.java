package _29_;

/*
 * �����г��ִ����������鳤��һ������֣�����������������ڷ���0
 * ���鹤������������м������ִ����Ƿ񳬹����鳤��*/
import java.util.Arrays;

public class MoreThanHalfNumber {
	public static int moreThanHalfNumber_Solution(int[] array) throws Exception {
		if (array == null) {
			throw new Exception("invalid array");
		}
		int n = array.length;
//		����
		Arrays.sort(array);
//		�������м���
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
