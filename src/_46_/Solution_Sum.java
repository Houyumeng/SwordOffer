package _46_;

/*
 * ��1+2+3+��+n��
 * Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
 * ��˹��͹�ʽ��1+n��*n/2*/
public class Solution_Sum {
	public static int getSum(int n) {
		int result = (int) (n + Math.pow(n, 2));
		return result >> 1;
	}
}
