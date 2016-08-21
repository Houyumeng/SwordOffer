package _9_;

import org.junit.Test;
//��쳲���������
public class OutputFibonacciSequence {
//	ʱ�临�Ӷ�ΪO(n)
	public int f(int n) {
		int[] fibN = new int[n+1];
		fibN[0] = 0;
		fibN[1] = 1;
		for (int i = 2; i <= n; i++) {
			fibN[i] = fibN[i - 2] + fibN[i - 1];
		}
		return fibN[n];
	}
//	 ʱ�临�Ӷ�Ϊ��O(logn)<O(n)���㷨
	
	// ���Ƽ��ݹ�
	// public int f(int n) {
	// if (n <= 0)
	// return 0;
	// if (n == 1)
	// return 1;
	// return f(n - 1) + (n - 2);
	// }
	@Test
	public void test() {
		System.out.println(f(10000));
	}
}
