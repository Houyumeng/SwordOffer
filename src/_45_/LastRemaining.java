package _45_;

/*
 * 0，1...n-1这n个数字排成一个圆圈，从数字0开始每次从这个圆圈中删除第m个数字。
 * 求出这个圆圈里剩下的最后一个数字。
 * 约瑟夫环问题：递归公式*/
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
