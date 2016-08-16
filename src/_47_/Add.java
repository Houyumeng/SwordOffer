package _47_;

/*
 * 不用加减乘除做加法*/
public class Add {
	public static int add(int n, int m) {
		int sum = 0;
		// carry为进位
		int carry = 0;
		do {
			// 先做异或，不计进位
			sum = n ^ m;
			// 做与运算并左移一位
			carry = n & m;
			n = sum;
			m = carry << 1;
		} while (carry != 0);
		return sum;
	}
}
