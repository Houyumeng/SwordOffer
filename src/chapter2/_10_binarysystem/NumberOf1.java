package chapter2._10_binarysystem;

//�������ת��Ϊ�����ƺ�1�ĸ���
public class NumberOf1 {
	public static int numOf1(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = (n - 1) & n;
		}
		return count;
	}
}
