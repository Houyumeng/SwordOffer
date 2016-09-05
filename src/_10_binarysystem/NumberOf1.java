package _10_binarysystem;

//输出整数转化为二进制后1的个数
public class NumberOf1 {
	public static long numOf1(long n) {
		long count = 0;
		while (n != 0) {
			count++;
			n = (n - 1) & n;
		}
		return count;
	}
}
