package _9_;

import org.junit.Test;

/*青蛙跳台阶问题
 * 斐波那契数列*/
public class Fibonacci {
	public static int getNumber(int n) {
		if (n == 1 || n == 2) {
			return n;
		}
		int one = 1;
		int two = 2;
		int fibN = 1;
		for (int i = 2; i <= n; i++) {
			fibN = one + two;
			one = two;
			two = fibN;
		}
		return fibN;
	}

	@Test
	public void test() {
		int number = getNumber(3);
		System.out.println(number);
	}
}
