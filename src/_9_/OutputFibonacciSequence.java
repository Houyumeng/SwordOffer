package _9_;

import org.junit.Test;

//��쳲���������
public class OutputFibonacciSequence {
	// ʱ�临�Ӷ�ΪO(n)
	public long f(int n) {
		int[] result = { 0, 1 };
		if (n < 2) {
			return result[n];
		}
		long one = 0;
		long two = 1;
		long fibN = 0;
		for (int i = 2; i <= n; i++) {
			fibN = one + two;
			one = two;
			two = fibN;
		}
		return fibN;
	}

	@Test
	public void test() {
		System.out.println(f(100));
	}
}
