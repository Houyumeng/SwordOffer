package chapter2._10_binarysystem;

//输出整数转化为二进制后1的个数
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
