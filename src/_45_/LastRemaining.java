package _45_;

/*
 * 0��1...n-1��n�������ų�һ��ԲȦ��������0��ʼÿ�δ����ԲȦ��ɾ����m�����֡�
 * ������ԲȦ��ʣ�µ����һ�����֡�
 * Լɪ�����⣺�ݹ鹫ʽ*/
public class LastRemaining {
	public static int getLastRemaining(int n, int m) {
		if (n < 1 || m < 1) {
			return -1;
		}
		if (n == 0) {
			return 0;
		}
		return (getLastRemaining(n - 1, m) + m) % n;
	}
}
